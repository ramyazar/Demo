package com.example.euriskoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserDetails extends AppCompatActivity {
    //Variables
    int userId;
    int id;
    String title;
    boolean completed;

    private TextView userIdTxt, idTxt, titleTxt, completedTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();

        userIdTxt = findViewById(R.id.userId);
        idTxt = findViewById(R.id.id);
        titleTxt = findViewById(R.id.title);
        completedTxt = findViewById(R.id.completed);
        if (bundle != null) {
            userId = bundle.getInt("userId");
            id = bundle.getInt("id");
            title = bundle.getString("title");
            completed = bundle.getBoolean("completed");
            userIdTxt.setText(String.valueOf(userId));
            idTxt.setText(String.valueOf(id));
            titleTxt.setText(title);
            completedTxt.setText(String.valueOf(completed));

        }
    }
}
