package com.example.weatherforecast;

        import android.widget.TextView;

        import org.json.JSONException;
        import org.json.JSONObject;

        import java.util.List;

public class Data {
    private String name ;
    Wind wind;
    Main main;
    private List<Weather> weather =null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }
}
