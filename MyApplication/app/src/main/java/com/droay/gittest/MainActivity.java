package com.droay.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"我是主干222",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"我是主干333",Toast.LENGTH_LONG).show();
    }
}
