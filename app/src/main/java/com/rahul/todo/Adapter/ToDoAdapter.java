package com.rahul.todo.Adapter;

import androidx.recyclerview.widget.RecyclerView;

import com.rahul.todo.Activity.MainActivity;
import com.rahul.todo.Model.ToDoModel;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ViewHolder>{

    private List<ToDoModel> todoList;
    private MainActivity activity;

    public ToDoAdapter(MainActivity activity){

    }

}
