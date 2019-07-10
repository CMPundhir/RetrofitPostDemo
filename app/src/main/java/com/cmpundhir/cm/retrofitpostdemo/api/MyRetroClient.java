package com.cmpundhir.cm.retrofitpostdemo.api;

import com.cmpundhir.cm.retrofitpostdemo.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyRetroClient {
    private static final String BASE_URL = "http://api.targetpubg.com";
    private static Retrofit retrofit = null;
    private static Retrofit init(){
        if(retrofit == null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    public static MyAPi api = init().create(MyAPi.class);
}
