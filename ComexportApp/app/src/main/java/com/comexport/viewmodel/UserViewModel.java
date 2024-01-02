package com.comexport.viewmodel;

import static java.lang.Boolean.TRUE;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.comexport.helper.UserHelper;

import org.reactivestreams.Subscriber;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class UserViewModel extends ViewModel {
    public static String TAG = UserViewModel.class.getSimpleName();
    public MutableLiveData<UserVieModelView> mPanelResponse;
    public LiveData<UserVieModelView> init(Context context) {

        // If the response is NULL, then load the INITIAL data...
        if (mPanelResponse == null)
        {
            mPanelResponse = new MutableLiveData<>();
            loadPanel( context);
        }

        return mPanelResponse;
    }
    private void loadPanel(Context context){

        Observable.defer(() -> Observable.just(UserHelper.getAll(context)))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(item -> mPanelResponse.postValue(item),
                        error -> {
                            UserVieModelView userVieModelView = new UserVieModelView();
                            userVieModelView.message = "Ocurrió un error";
                            userVieModelView.isError = TRUE;
                            mPanelResponse.postValue(userVieModelView);
                        },
                        () -> System.out.println("User Finish")
                );

    }
}
