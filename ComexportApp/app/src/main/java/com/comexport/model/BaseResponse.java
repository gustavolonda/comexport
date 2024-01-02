package com.comexport.model;

import com.google.gson.annotations.SerializedName;

public class BaseResponse {
    @SerializedName("status")
    public String status;
    @SerializedName("message")
    public String message;
    @SerializedName("className")
    public String className;
    @SerializedName("module")
    public String module;
}
