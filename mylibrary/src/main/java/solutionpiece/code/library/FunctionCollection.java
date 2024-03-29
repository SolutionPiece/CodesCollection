package solutionpiece.code.library;


import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FunctionCollection {

    private static Context context;
    SimpleDateFormat time_format, date_format, day_format;
    Date current_date;
    static String color_samsung, color_orange, color_blue, color_green, color_dark_blue, color_red, color_white;

    public FunctionCollection(Context context) {
        this.context = context;

        time_format = new SimpleDateFormat("HH:mm");
        day_format = new SimpleDateFormat("EEEE");
        date_format = new SimpleDateFormat("dd/MMM/yyyy");
        current_date= new Date();

        AssigningValuToClour();
    }



    public void ShareAppFunction() {

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        shareIntent.setType("text/plain");
        shareIntent.addFlags(Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=" + context.getPackageName());
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT) {
            context.startActivity(shareIntent);
        } else {
            context.startActivity(Intent.createChooser(shareIntent, "share"));
        }
    }


    public void MoreAppsClick()
    {
        try {
            Uri marketUri = Uri.parse("market://search?q=pub:Solution Piece");
            Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
            context.startActivity(marketIntent);
        } catch (ActivityNotFoundException anfe) {
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Solution Piece")));
        }
    }

    public boolean isConnectingToInternet() {

        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {

            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED &&   info[i].getState() != NetworkInfo.State.SUSPENDED) {

                        return true;
                    }
        }

        return false;
    }



    public boolean DialogRateGet()
    {
        SharedPreferences prefs  = context.getSharedPreferences("DialogRateGet", Context.MODE_PRIVATE);
        int count  = Integer.parseInt(prefs.getString("DialogRate" , "0"));
        int backpress_count  = context.getResources().getInteger(R.integer.backpress_count);

        Log.d("DashboardActivityLog","count : "+count);
        Log.d("DashboardActivityLog","Backpress : "+backpress_count);
        if(count == backpress_count)
        {
            DialogRateSave(String.valueOf(backpress_count));
            return false;
        }
        else if(count == (backpress_count-1))
        {
            if(isConnectingToInternet())
            {
                DialogRateSave("0");
                return true;
            }
            return false;
        }
        else
        {
            DialogRateSave(String.valueOf(count+1));
            return false;
        }
    }


    public String DateDBUpdateGet(){
        SharedPreferences prefs  = context.getSharedPreferences("CurrentDate", Context.MODE_PRIVATE);
        return prefs.getString("CurrentDateKey" , "01/10/2018");
    }

    public void DateDBUpdateSave(String value){
        SharedPreferences prefs = context.getSharedPreferences("CurrentDate", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =  prefs.edit();
        editor.putString("CurrentDateKey" , value);
        editor.commit();
    }


    public void DialogRateSave(String value){
        SharedPreferences prefs = context.getSharedPreferences("DialogRateGet", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =  prefs.edit();
        editor.putString("DialogRate" , value);
        editor.commit();
    }

    public void RateUsApp(Context context) {
        Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            context.startActivity(myAppLinkToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(context, " unable to find market app", Toast.LENGTH_LONG).show();

        }
    }

    public String SharePrefGetValue(String key, String default_value){
        SharedPreferences prefs  = context.getSharedPreferences("RemoteApp", Context.MODE_PRIVATE);
        return prefs.getString(key , default_value);
    }

    public void SharePrefSaveValue(String key, String value){
        SharedPreferences prefs = context.getSharedPreferences("RemoteApp", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =  prefs.edit();
        editor.putString(key , value);
        editor.commit();
    }




    public static void DisplayCustomizeToast(Context context, String message, int colour_back_pos, int colour_text_pos, boolean isLong) {

        String[] arrayColors = {color_samsung, color_orange, color_blue, color_green, color_dark_blue, color_red, color_white};
        View layoutValue = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        CardView background = (CardView) layoutValue.findViewById(R.id.custom_toast_layout_id);
        TextView text = (TextView) layoutValue.findViewById(R.id.message);

        Toast custom_toast = new Toast(context);
        if(isLong)
            custom_toast.setDuration(Toast.LENGTH_SHORT);
        else
            custom_toast.setDuration(Toast.LENGTH_LONG);

        text.setTextSize(18);
        text.setText(message);
        custom_toast.setGravity(Gravity.BOTTOM, 0, 200);
        text.setTextColor(Color.parseColor(arrayColors[colour_text_pos]));
        background.setCardBackgroundColor(Color.parseColor(arrayColors[colour_back_pos]));

        custom_toast.setView(layoutValue);
        if(message.length() > 0)
        {
            custom_toast.show();
        }
    }

    public void ShareFunctionFinal(String resource_url) {
        Uri URI = Uri.parse(resource_url);
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("image/jpeg");
        emailIntent.setType("image/jpg");
        emailIntent.setType("image/png");
        emailIntent.setType("image/gif");
        emailIntent.setType("videos/*");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {""});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        // emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
        emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file://"+URI));
        context.startActivity(Intent.createChooser(emailIntent, "Sharing Options"));
    }



    public void ShareFileGmail(String message)
    {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setType("text/plain");
            Uri data = Uri.parse("mailto:?subject=" + context.getResources().getString(R.string.app_name) + "&body=" + message + "&to=" + "solutionpieceteam@gmail.com");
            intent.setData(data);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            context.startActivity(Intent.createChooser(intent, "Choose Gmail"));


        } catch(Exception e)  {
            System.out.println("is exception raises during sending mail"+e);
        }
    }



    // Custom method to convert string to url
    public URL stringToURL(String urlString){
        try{
            URL url = new URL(urlString);
            return url;
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
        return null;
    }

    private void scanner(String path) {

        MediaScannerConnection.scanFile(context, new String[] { path }, null, new MediaScannerConnection.OnScanCompletedListener() {

            public void onScanCompleted(String path, Uri uri) {
                Log.i("UpdateLogsCheck", "Finished scanning " + path);
            }
        });
    }

    private void addImageGallery( File file ) {
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.DATA, file.getAbsolutePath());
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/PNG"); // or image/png
        context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
    }

    public void AssigningValuToClour()
    {
        color_samsung = context.getResources().getString(R.string.color_samsung);
        color_orange = context.getResources().getString(R.string.color_orange);
        color_blue = context.getResources().getString(R.string.color_blue);
        color_green = context.getResources().getString(R.string.color_green);
        color_dark_blue = context.getResources().getString(R.string.color_dark_blue);
        color_red = context.getResources().getString(R.string.color_red);
        color_white = context.getResources().getString(R.string.color_white);
    }

    //============= New Code ===============================================

    public String getEmojiByUnicode(int unicode){
        return new String(Character.toChars(unicode));
    }

    public String getCurrentTime()
    {
        String time = time_format.format(current_date);
        return time;
    }

    public String getCurrentDay()
    {
        String day = day_format.format(current_date);
        return day;
    }

    public String getCurrentDate()
    {
        String date = date_format.format(current_date);
        return date;
    }


    public String getUniqueDeviceID()
    {
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;
        String androidID = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        if (model.startsWith(manufacturer)) {
            return capitalize(model);
        }
        return capitalize(manufacturer) + "-" + model+ "-" + androidID;
    }

    private String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] arr = str.toCharArray();
        boolean capitalizeNext = true;

        StringBuilder phrase = new StringBuilder();
        for (char c : arr) {
            if (capitalizeNext && Character.isLetter(c)) {
                phrase.append(Character.toUpperCase(c));
                capitalizeNext = false;
                continue;
            } else if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            }
            phrase.append(c);
        }

        return phrase.toString();
    }


    public String getTimeFormate(String time)
    {
        String format;
        String[] fullString = time.split(":");
        int hour = Integer.parseInt(fullString[0]);

        String min = fullString[1];
        String[] fullString2 = min.split(" ");
        int minute = Integer.parseInt(fullString2[0]);

        if (hour == 0) {
            hour += 12;
            format = "AM";
        } else if (hour == 12) {
            hour = 12;
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }

        String correctTime = getFirstDigitFormate(hour) + ":" + getFirstDigitFormate(minute) +" "+format;
        return  correctTime;
    }


    public String getFirstDigitFormate(int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }

    public String getCurrencyFormat(String amount) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0");
        return formatter.format(Double.parseDouble(amount));
    }


}
