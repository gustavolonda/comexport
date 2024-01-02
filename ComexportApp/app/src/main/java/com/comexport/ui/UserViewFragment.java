package com.comexport.ui;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.comexport.R;
import com.comexport.databinding.FragmentUserViewBinding;
import com.comexport.viewmodel.UserViewModel;
import com.comexport.viewmodel.UserViewModelAdapter;


public class UserViewFragment extends Fragment {
    FragmentUserViewBinding mBinding;
    UserViewModel mViewModel;
    UserViewModelAdapter mAdapter;
    public UserViewFragment() {
        // Required empty public constructor
    }

    public static UserViewFragment newInstance() {
        UserViewFragment fragment = new UserViewFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_user_view,container,false);
        mViewModel = new ViewModelProvider(this).get(UserViewModel.class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        mViewModel.init(getContext()).observe(getActivity(), response -> {
            mAdapter.setItems(response.userList);
        });
        mAdapter = new UserViewModelAdapter(getActivity());
        mBinding.recyclerview.setLayoutManager(layoutManager);
        mBinding.recyclerview.setAdapter(mAdapter);
        return mBinding.getRoot();
    }
}