package com.example.tpdaoviewmodelmutablelivedatarecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tpdaoviewmodelmutablelivedatarecyclerview.Model.Person;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private  List<Person> personList;

    public MyAdapter(List<Person> personList) {
        this.personList = personList;
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewNameRow, textViewFirstNameRow ;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNameRow = itemView.findViewById(R.id.text_list_name);
            textViewFirstNameRow = itemView.findViewById(R.id.text_list_firstname);

        }

        public TextView getTextViewNameRow() {
            TextView textViewNameRow = this.textViewNameRow;
            return textViewNameRow;
        }

        public TextView getTextViewFirstNameRow() {
            return textViewFirstNameRow;
        }
    }



    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.getTextViewNameRow().setText(personList.get(position).getName());
        holder.getTextViewFirstNameRow().setText(personList.get(position).getFirstName());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }


}

