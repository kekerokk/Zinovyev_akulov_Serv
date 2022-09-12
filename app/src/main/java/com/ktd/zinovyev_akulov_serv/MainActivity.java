package com.ktd.zinovyev_akulov_serv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;

import android.os.Bundle;

import com.ktd.zinovyev_akulov_serv.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding __binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        __binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(__binding.getRoot());

        __binding.GO.setOnClickListener(view ->
        {
            String login = __binding.LoginForm.getText().toString();
            String pass = __binding.PasswordForm.getText().toString();
            User user = new User(pass,login);
            SetUserInDB(user);

 /*           __binding.textView.post(new Runnable() {
                @Override
                public void run() {
                    __binding.textView.setText(LocalDataBase.getInstance(getApplicationContext()).dao().getAll().toString());
                }
            });*/
        });
    }

    public void SetUserInDB(User user)
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                LocalDataBase.getInstance(getApplicationContext()).dao().insert(user);
            }
        }).start();
    }


}