package com.alaminkarno.recyclerviewonclick.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.alaminkarno.recyclerviewonclick.R;

public class ContactDetailsActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView nameTV,phoneTV;

    private String name,phone;
    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        initialize();

        getDataFromIntent();

        setDataToView();
    }

    void setDataToView(){
        nameTV.setText(name);
        phoneTV.setText(phone);
        imageView.setImageResource(image);
    }


    void  getDataFromIntent(){

        name = getIntent().getStringExtra("name");
        phone = getIntent().getStringExtra("phone");
        image = getIntent().getIntExtra("image",R.drawable.ic_baseline_account_circle_24);

    }

    void  initialize(){

        imageView = findViewById(R.id.imageView);
        nameTV = findViewById(R.id.nameTV);
        phoneTV = findViewById(R.id.phoneTV);

    }
}