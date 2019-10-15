package com.example.nestedrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.AbsListView;

import com.example.nestedrecyclerview.model.Child;
import com.example.nestedrecyclerview.model.Parent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Parent> parentArrayList;
ArrayList<Child> childArrayList;

ParentAdapter parentAdapter;
RecyclerView parentRecyclerView;
public static String TAG="test";
int currentItems,totlitems,scrollOutitems;
boolean isScrolling=false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parentRecyclerView=findViewById(R.id.parentrecyclerView);
        final LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);

        parentArrayList=new ArrayList<>();
        childArrayList=new ArrayList<>();

        parentArrayList.add(new Parent("Item 1"));
        parentArrayList.add(new Parent("Item 2"));
        parentArrayList.add(new Parent("Item 3"));
        parentArrayList.add(new Parent("Item 4"));
        parentArrayList.add(new Parent("Item 5"));
        parentArrayList.add(new Parent("Item 6"));
        parentArrayList.add(new Parent("Item 7"));
        parentArrayList.add(new Parent("Item 8"));
        parentArrayList.add(new Parent("Item 9"));
        parentArrayList.add(new Parent("Item 10"));
        parentArrayList.add(new Parent("Item 11"));
        childArrayList.add(new Child("SubItem 1","23"));
        childArrayList.add(new Child("SubItem 2","24"));
        childArrayList.add(new Child("SubItem 3","25"));
        childArrayList.add(new Child("SubItem 4","26"));
        childArrayList.add(new Child("SubItem 5","27"));
        childArrayList.add(new Child("SubItem 6","28"));
        childArrayList.add(new Child("SubItem 6","28"));
        parentAdapter=new ParentAdapter(this,parentArrayList,childArrayList);
        parentRecyclerView.setLayoutManager(linearLayoutManager);

        parentRecyclerView.setAdapter(parentAdapter);






    }


}
