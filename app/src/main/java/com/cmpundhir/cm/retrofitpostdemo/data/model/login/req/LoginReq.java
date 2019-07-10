package com.cmpundhir.cm.retrofitpostdemo.data.model.login.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginReq {

    @SerializedName("uname")
    @Expose
    private String uname;
    @SerializedName("pass")
    @Expose
    private String pass;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}