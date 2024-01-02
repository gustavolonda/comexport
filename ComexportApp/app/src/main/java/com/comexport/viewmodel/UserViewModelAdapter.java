package com.comexport.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.comexport.R;
import com.comexport.databinding.ItemFragmentUserViewBinding;
import com.comexport.ui.UserViewFragment;

import java.util.Collection;
import java.util.List;

public class UserViewModelAdapter extends RecyclerView.Adapter<UserViewModelAdapter.ViewHolder> {
    ItemFragmentUserViewBinding itemFragmentUserViewBinding;
    private LayoutInflater inflater;
    private List<UserVieModelViewItem> items;
    private Context mContext;
    public int ITEM_VIEW = R.layout.item_fragment_user_view;
    public UserViewModelAdapter(Context context) {
        this.mContext = context ;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int layoutId) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        itemFragmentUserViewBinding= DataBindingUtil.inflate(inflater, ITEM_VIEW, viewGroup, false);
        return new ViewHolder(itemFragmentUserViewBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        final UserVieModelViewItem item = items.get(position);
        viewHolder.binding.setDataViewModel(item);
    }

    @Override
    public int getItemCount()
    {
        return items == null ? 0 : items.size();
    }
    public void setItems(List<UserVieModelViewItem> items)
    {
        if (this.items == items)
        {
            return;
        }

        if (this.items != null)
        {
            notifyItemRangeRemoved(0, this.items.size());
        }
        if (this.items != items)
        {   this.items = items;
            notifyItemRangeInserted(0, this.items.size());
        }


    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        final ItemFragmentUserViewBinding binding;

        ViewHolder(ItemFragmentUserViewBinding binding)
        {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
