package com.droay.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    public static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"我是开发分支",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"我是开发分支666",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"我是开发分支877！！",Toast.LENGTH_LONG).show();
    }
}
