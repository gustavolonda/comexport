package com.comexport.viewmodel;

import com.comexport.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserVieModelView {
    public static String message = "";
    public static boolean isError = false;
    public static boolean isLoading = false;
    public List<UserVieModelViewItem> userList = new ArrayList();

    public boolean showMessage(){
        return !message.isEmpty();
    }



}
