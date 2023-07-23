package com.proyecto.tarea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("John wick","alex123 sa",R.drawable.a));
        items.add(new Item("Robert j","alex123 sa",R.drawable.b));
        items.add(new Item("James Gunn","alex123 sa",R.drawable.c));
        items.add(new Item("Ricky tales","alex123 saasa",R.drawable.d));
        items.add(new Item("Micky mose","alex123 sa22",R.drawable.e));
        items.add(new Item("Pick War","alex123 sa",R.drawable.f));
        items.add(new Item("Leg piece","alex123 sa",R.drawable.g));
        items.add(new Item("Apple Mac","alex123 sa",R.drawable.g));
        items.add(new Item("John wick","alex123 sa",R.drawable.a));
        items.add(new Item("Robert j","alex123 sa",R.drawable.b));
        items.add(new Item("James Gunn","alex123 sa",R.drawable.c));
        items.add(new Item("Ricky tales","alex123 sa",R.drawable.d));
        items.add(new Item("Micky mose","alex123 sa",R.drawable.e));
        items.add(new Item("Pick War","alex123 sa",R.drawable.f));
        items.add(new Item("Leg piece","alex123 sa",R.drawable.g));
        items.add(new Item("Apple Mac","alex123 sa",R.drawable.g));




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}