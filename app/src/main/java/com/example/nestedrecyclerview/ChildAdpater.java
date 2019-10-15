package com.example.nestedrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerview.model.Child;

import java.util.ArrayList;

public class ChildAdpater extends RecyclerView.Adapter<ChildAdpater.ChildViewHolder> {
    Context context;
    ArrayList<Child> arrayList;

    public ChildAdpater(Context context, ArrayList<Child> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.childlayout,parent,false);
        ChildViewHolder childViewHolder=new ChildViewHolder(view);
        return childViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {
        holder.description.setText(arrayList.get(position).getDescription());
        holder.price.setText(arrayList.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    class ChildViewHolder extends RecyclerView.ViewHolder{
        TextView description;
        TextView price;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            description=itemView.findViewById(R.id.textView);
            price=itemView.findViewById(R.id.textView2);

        }
    }

}
