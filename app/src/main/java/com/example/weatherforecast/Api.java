package com.example.weatherforecast;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface Api {

    @Headers({

            "x-api-key: 700a8df919188283e551a361b38250b9"
    })
    @GET("weather")//i.e https://api.demo.com/Search?
    Call<Data> getData(@Query("lat") String latitude, @Query("lon") String longitude,@Query("appid")String APP_ID);

}
