package com.example.digilocker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.digilocker.Adapter.use_adapter;
import com.example.digilocker.Model.use_model;

import java.util.ArrayList;
import java.util.List;

public class Homefragment extends Fragment  {
    //        getSupportActionBar().hide();

//    RecyclerView recyclerView;
//    List<use_model> itemlist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_home,container,false);
    /*    recyclerView =v.findViewById(R.id.use_recycle);
//        recyclerView.setLayoutManager( new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        recyclerView.setLayoutManager( new LinearLayoutManager(getContext()));

//        initdata();
        recyclerView.setAdapter(new use_adapter(initdata()));

*/
        return v;

    }
/*
    private List<use_model> initdata() {

        itemlist = new ArrayList<>();
        itemlist.add(new use_model(R.drawable.digi1));
        itemlist.add(new use_model(R.drawable.digi2));
        itemlist.add(new use_model(R.drawable.digi3));
        itemlist.add(new use_model(R.drawable.digi4));
        itemlist.add(new use_model(R.drawable.digi5));

        return itemlist;
    }
*/

}
