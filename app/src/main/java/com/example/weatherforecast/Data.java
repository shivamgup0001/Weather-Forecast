package com.example.weatherforecast;

        import android.widget.TextView;

        import org.json.JSONException;
        import org.json.JSONObject;

public class Data {
    private String mweatherState, mwind, mhumidity, mpressure, mtemp, min,max, location,icon;

    public  Data fromJson(JSONObject jsonObject){

        try {
            Data data =new Data();
            data.location=jsonObject.getString("name");
            data.mweatherState=jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
            data.mwind=Double.toString(jsonObject.getJSONObject("wind").getDouble("speed"));
            data.mhumidity=Integer.toString(jsonObject.getJSONObject("main").getInt("humidity"));
            data.mpressure=Integer.toString(jsonObject.getJSONObject("main").getInt("pressure"));
            data.mtemp=Double.toString(jsonObject.getJSONObject("main").getDouble("temp")-273);
            data.min=Double.toString(jsonObject.getJSONObject("main").getDouble("temp_min")-273);
            data.max=Double.toString(jsonObject.getJSONObject("main").getDouble("temp_max")-273);
            data.icon=jsonObject.getJSONArray("weather").getJSONObject(0).getString("icon");
            return data;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getMweatherState() {
        return mweatherState;
    }

    public String getMwind() {
        return mwind;
    }

    public String getMhumidity() {
        return mhumidity;
    }

    public String getMpressure() {
        return mpressure;
    }

    public String getMtemp() {
        return mtemp+"°C";
    }

    public String getMin() {
        return min+"°C";
    }

    public String getMax() {
        return max+"°C";
    }

    public String getLocation() {
        return location;
    }

    public String getIcon() {
        return icon;
    }
}
