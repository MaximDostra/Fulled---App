package com.example.fulled_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAddItem, buttonAddItem2, buttonAddItem3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddItem = (Button)findViewById(R.id.btn_add_item);
        buttonAddItem.setOnClickListener(this);

        buttonAddItem2 = (Button)findViewById(R.id.edit_user2);
        buttonAddItem2.setOnClickListener(this);

        buttonAddItem3 = (Button)findViewById(R.id.edit_user);
        buttonAddItem3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v==buttonAddItem){

            Intent intent = new Intent(getApplicationContext(),AddItem.class);
            startActivity(intent);
        }

        if(v==buttonAddItem2) {

            Intent intent = new Intent(getApplicationContext(), ListItem.class);
            startActivity(intent);
        }

        if (v == buttonAddItem3) {

                WebView webView = new WebView(this);
                setContentView(webView);
                webView.loadUrl("https://calendar.google.com/calendar/r?tab=rc&pli=1");
        }

        }

    }


