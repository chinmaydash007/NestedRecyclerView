package com.example.nestedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.request.RequestOptions;
import com.example.nestedrecyclerview.model.Child;
import com.example.nestedrecyclerview.model.Parent;

import java.util.ArrayList;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ParentViewHolder> {
    Context context;
    ArrayList<Parent>  arrayList;
    ArrayList<Child> childArrayList;



    public ParentAdapter(Context context, ArrayList<Parent> arrayList,ArrayList<Child> childArrayList) {
        this.context = context;
        this.arrayList = arrayList;
        this.childArrayList=childArrayList;

    }

    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.parentlayout,parent,false);
        ParentViewHolder parentViewHolder=new ParentViewHolder(view);
        return parentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, int position) {
        holder.title.setText(arrayList.get(position).getTitle());
        ChildAdpater childAdpater=new ChildAdpater(context,childArrayList);
        holder.childRecyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        holder.childRecyclerView.setAdapter(childAdpater);



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ParentViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        RecyclerView childRecyclerView;


        public ParentViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            childRecyclerView=itemView.findViewById(R.id.childRecyclerView);


        }
    }
}
