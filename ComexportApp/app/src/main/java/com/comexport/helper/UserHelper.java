package com.comexport.helper;

import static java.lang.Boolean.TRUE;

import android.content.Context;
import android.os.Build;

import com.comexport.model.UserResponse;
import com.comexport.network.AccountService;
import com.comexport.network.APIClient;
import com.comexport.util.InternetUtil;
import com.comexport.viewmodel.UserVieModelView;
import com.comexport.viewmodel.UserVieModelViewItem;

import java.util.stream.Collectors;

import retrofit2.Call;

public class UserHelper {
    public static UserVieModelView getAll(Context context){
        UserVieModelView userVieModelView = new UserVieModelView();
        AccountService apiInterface = APIClient.getClient().create(AccountService.class);
        try {
            if (!InternetUtil.getInstance(context).isOnline()){
                userVieModelView.message = "Verificar la conexion del Internet";
                userVieModelView.isError = TRUE;
                return userVieModelView;
            }
            Call<UserResponse> call = apiInterface.getAll();
            UserResponse response = call.execute().body();
            if (response.result.size() == 0){
                userVieModelView.message = "No hay datos para mostrar";
                return userVieModelView;
            }


            userVieModelView.userList = response.result.stream().map( userModel -> {
                                                                    UserVieModelViewItem userVieModelViewItem = new UserVieModelViewItem();
                                                                    userVieModelViewItem.id          = userModel.id;
                                                                    userVieModelViewItem.firstName   = userModel.firstName;
                                                                    userVieModelViewItem.lastName    = userModel.lastName;
                                                                    userVieModelViewItem.phoneNumber = userModel.phoneNumber;
                                                                    userVieModelViewItem.photoPath   = userModel.photoPath;
                                                                    return userVieModelViewItem;
                                                                }).collect(Collectors.toList());


            return userVieModelView;

        }catch (Exception e){
            userVieModelView.message = "Ocurrió un error";
            userVieModelView.isError = TRUE;
            return userVieModelView;
        }
    }
}
