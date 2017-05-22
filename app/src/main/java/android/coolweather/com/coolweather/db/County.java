package android.coolweather.com.coolweather.db;

import android.provider.ContactsContract;

import org.litepal.crud.DataSupport;

/**
 * Created by lzq on 2017/5/22.
 */
public class County extends DataSupport{

    private int id;

    private String countyName;

    private String cityId;

    private String weatherId;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
