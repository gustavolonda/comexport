package com.comexport.model;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("id")
    public String id;
    @SerializedName("firstName")
    public String firstName;
    @SerializedName("lastName")
    public String lastName;
    @SerializedName("phoneNumber")
    public String phoneNumber;
    @SerializedName("photoPath")
    public String photoPath;
}
