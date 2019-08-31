package solutionpiece.code.library.ModalClasses;

import androidx.annotation.Keep;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
@Keep
public class UpdateModal
{
    String update_status;
    String version_code;
    String info_date;
    String info_day;

    public UpdateModal(String update_status, String version_code, String info_date, String info_day) {
        this.update_status = update_status;
        this.version_code = version_code;
        this.info_date = info_date;
        this.info_day = info_day;
    }

    public String getUpdate_status() {
        return update_status;
    }

    public void setUpdate_status(String update_status) {
        this.update_status = update_status;
    }

    public String getVersion_code() {
        return version_code;
    }

    public void setVersion_code(String version_code) {
        this.version_code = version_code;
    }

    public String getInfo_date() {
        return info_date;
    }

    public void setInfo_date(String info_date) {
        this.info_date = info_date;
    }

    public String getInfo_day() {
        return info_day;
    }

    public void setInfo_day(String info_day) {
        this.info_day = info_day;
    }
}