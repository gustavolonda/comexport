package com.comexport.network;

public class ApiConstants {
    public static String BASE_URL = "https://8368-157-100-110-78.ngrok-free.app/api/";
    public static final String REQUEST_MAPPING_ACCOUNTS = "accounts";
    public static final String REQUEST_MAPPING_USERS = REQUEST_MAPPING_ACCOUNTS+"/users";

    public static final String ID = "id";
    public static final String REQUEST_MAPPING_USER_BY_ID = REQUEST_MAPPING_USERS+"/{id}";
}
