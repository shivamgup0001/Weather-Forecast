package com.example.weatherforecast;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {


    private static Retrofit getRetrofit(){

        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient=new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        Retrofit retrofit=new Retrofit.Builder().
                baseUrl("https://api.openweathermap.org/data/2.5/").
                addConverterFactory(GsonConverterFactory.create()).
                client(okHttpClient).
                build();


        return retrofit;
    }

    public static Api getApi(){
        Api api= getRetrofit().create(Api.class);

        return api;
    }
}
