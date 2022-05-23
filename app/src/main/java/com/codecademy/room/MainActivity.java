package com.codecademy.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonDatabase appDb = PersonDatabase.getInstance(MainActivity.this);
        EditText name = findViewById(R.id.name);
        EditText city = findViewById(R.id.city);
        Button send = findViewById(R.id.button);
        send.setOnClickListener(v -> {

        });


    }
}