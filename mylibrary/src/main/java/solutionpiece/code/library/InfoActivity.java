package solutionpiece.code.library;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    private ImageView btn_back_press;
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_info);


        btn_back_press = findViewById(R.id.btn_back_press);
        btnDelete = findViewById(R.id.btnDelete);


        btn_back_press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Intent.ACTION_DELETE);
                    intent.setData(Uri.parse("package:" + getPackageName()));
                    startActivity(intent);
                }
                catch (Exception ex)
                {
                    FunctionCollection.DisplayCustomizeToast(InfoActivity.this, ex.toString(),0,7,true);
                    return;
                }
            }
        });
    }
}
