package com.comexport.network;

import static com.comexport.network.ApiConstants.ID;
import static com.comexport.network.ApiConstants.REQUEST_MAPPING_USERS;
import static com.comexport.network.ApiConstants.REQUEST_MAPPING_USER_BY_ID;

import com.comexport.model.UserModel;
import com.comexport.model.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AccountService {
    @GET(REQUEST_MAPPING_USERS)
    Call<UserResponse> getAll();
    @GET(REQUEST_MAPPING_USER_BY_ID)
    Call<UserResponse> getById(@Path(ID) String id);

    @POST(REQUEST_MAPPING_USERS)
    Call<UserResponse> save(@Body UserModel userModel);
    @PUT(REQUEST_MAPPING_USER_BY_ID)
    Call<UserResponse> update(@Path(ID) String id, @Body UserModel userModel);

    @DELETE(REQUEST_MAPPING_USER_BY_ID)
    Call<UserResponse> delete(@Path(ID) String id);
}
