package com.ronny202102241.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);
        String imageUri = "https://images.squarespace-cdn.com/content/v1/603439257f4b9a6cf2cf0ec7/1619540142995-FINQ1UDJ3M9QYVDT54R0/vanderbilt+beach+resort.jpg";
        Picasso.with(this).load(imageUri).into(_imageView1);
    }
}