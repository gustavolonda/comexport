package com.comexport.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class UserResponse extends BaseResponse{
    @SerializedName("result")
    public ArrayList<UserModel> result;
}
