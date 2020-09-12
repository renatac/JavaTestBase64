package com.example.testbase64;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.widget.Toast;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {
z
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String texto = "amor";
        byte [] data = new byte[0];
        try {
            data = texto.getBytes("UTF-8");
            Toast.makeText(MainActivity.this,
                    "data = "+data, Toast.LENGTH_LONG).show();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String base64 = Base64.encodeToString(data, Base64.DEFAULT);
        Toast.makeText(MainActivity.this, "Encrypt " + base64, Toast.LENGTH_LONG).show();


        byte[] data2 = Base64.decode(base64, Base64.DEFAULT);
        try {
            String text = new String(data2, "UTF-8");
            Toast.makeText(MainActivity.this, "Decrypt " + text, Toast.LENGTH_LONG).show();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
