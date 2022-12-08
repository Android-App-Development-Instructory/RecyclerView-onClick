package com.alaminkarno.recyclerviewonclick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.alaminkarno.recyclerviewonclick.adapters.ContactAdapter;
import com.alaminkarno.recyclerviewonclick.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactRecyclerView;
    private ContactAdapter contactAdapter;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        setDataToRecyclerView();
    }

    @SuppressLint("NotifyDataSetChanged")
    void  setDataToRecyclerView(){
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin 02","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin 03","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));
        contactList.add(new Contact("Md. Al-Amin","01621893919",R.drawable.ic_baseline_account_circle_24));

        contactAdapter.notifyDataSetChanged();
        // contactAdapter = new ContactAdapter(contactList);
    }

    void initialize(){

        contactRecyclerView = findViewById(R.id.contactRecyclerView);
        contactRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        contactList = new ArrayList<>();
        contactAdapter = new ContactAdapter(contactList,this);
        contactRecyclerView.setAdapter(contactAdapter);

    }
}