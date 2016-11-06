package com.example.mdkamrul.practise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.example.mdkamrul.practise.R.id.my_toolbar;

public class ConverterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        Toolbar toolbar = (Toolbar) findViewById(my_toolbar) ;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.converterappbar,menu);
        return super.onCreateOptionsMenu(menu);
    }


    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.arrow_backword:
                Intent intent = new Intent(getApplicationContext(),IntentActivity.class);
                startActivity(intent);
            default:
            return super.onOptionsItemSelected(item);
        }
    }
    */
}
