package com.example.euriskoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.example.euriskoapp.Helpers.PreferencesHelper;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    //variables
    private EditText usernameET;
    private EditText passwordET;
    private CheckBox rememberMeCheckkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameET = findViewById(R.id.input_username);
        passwordET = findViewById(R.id.input_password);
        rememberMeCheckkBox = findViewById(R.id.loginCheckBox);

        fillUsernameAndPassword();
        AppCompatButton loginBtn = findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(this);
        rememberMeCheckkBox.setOnCheckedChangeListener(this);

    }

    /**
     * Fill the fields with predefined values
     */
    private void fillUsernameAndPassword() {
        usernameET.setText(getString(R.string.user));
        passwordET.setText(getString(R.string.admin));
    }

    /**
     * Navigate to the main timer screen after logging in
     */
    private void signIn() {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * Onclick of views
     *
     * @param view
     */
    @Override
    public void onClick(View view) {
        //switch statement to check if we have other scenarios
        switch (view.getId()) {
            case (R.id.btn_login): {
                signIn();
                break;
            }
        }
    }

    /**
     * On check listener of checkbox
     */
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked) {
            PreferencesHelper.getInstance(this).setRememberMeValue(true);
        } else {
            PreferencesHelper.getInstance(this).setRememberMeValue(false);
        }
    }
}
