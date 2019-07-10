package com.cmpundhir.cm.retrofitpostdemo.api;

import com.cmpundhir.cm.retrofitpostdemo.data.model.login.req.LoginReq;
import com.cmpundhir.cm.retrofitpostdemo.data.model.login.res.LoginRes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface MyAPi {

    @Headers("Content-Type: application/json")
    @POST("/user/login")
    Call<LoginRes> login(@Body LoginReq req);
}
