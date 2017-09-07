package com.example.ashraf.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactRecyclerView;

    private PhoneContact phoneContact;
    private ArrayList<PhoneContact>contacts;

    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecyclerView = (RecyclerView) findViewById(R.id.mRecyclerView);
        phoneContact = new PhoneContact();
        contacts = phoneContact.getAllContacts();

        adapter = new ContactAdapter(this,contacts);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        GridLayoutManager glm = new GridLayoutManager(this,2);

        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

        contactRecyclerView.setLayoutManager(sglm);
        contactRecyclerView.setAdapter(adapter);
    }
}
