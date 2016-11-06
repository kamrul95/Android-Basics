package com.example.mdkamrul.practise;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import static com.example.mdkamrul.practise.R.id.expanded_menu;
import static com.example.mdkamrul.practise.R.id.my_toolbar;

public class IntentActivity extends AppCompatActivity {
    Button buttonYoutube,buttonConverter;
    private Toolbar backTookber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        Toolbar toolbar = (Toolbar) findViewById(my_toolbar);
        setSupportActionBar(toolbar);
        //toolbar.setLogo(R.drawable.ic_arrow_back_black_24dp);


        buttonYoutube = (Button)findViewById(R.id.buttonYoutube);
        buttonConverter = (Button)findViewById (R.id.buttonConverter);
        buttonYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
                startActivity (newIntent);
            }
        });

        buttonConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent converterIntent = new Intent(getApplicationContext(),ConverterActivity.class);
                startActivity(converterIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,  menu);
        return super.onCreateOptionsMenu(menu);

    }
/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.arrow_forword:
                Intent intent = new Intent(getApplicationContext(),ConverterActivity.class);
                startActivity(intent);
            default:
            return super.onOptionsItemSelected(item);
        }
    }
    */
}
