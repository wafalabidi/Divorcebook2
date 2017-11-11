package com.labidi.wafa.divorcebook;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Wafa on 11/11/2017.
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    private EditText et_firstname;
    private EditText et_lastname;
    private EditText et_mail;
    private EditText et_pwd;
    private Button btn_continue;
    // [START declare_auth]
    private FirebaseAuth mAuth;
    // [END declare_auth]

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        getActionBar().hide();
        //Views
        et_firstname = (EditText)findViewById(R.id.et_name);
        et_lastname = (EditText)findViewById(R.id.et_lastname);
        et_mail = (EditText)findViewById(R.id.et_mail);
        et_pwd = (EditText)findViewById(R.id.et_pwd);
        //Buttons
        btn_continue =(Button)findViewById(R.id.btn_register);

        // [START initialize_auth]
        mAuth = FirebaseAuth.getInstance();
        // [END initialize_auth]
    }


    @Override
    public void onClick(View view) {

    }
}
