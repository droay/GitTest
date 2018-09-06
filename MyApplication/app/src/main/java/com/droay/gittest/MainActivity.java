package com.droay.gittest;

import android.os.Bundle;
<<<<<<<<< Temporary merge branch 1
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
=========
import android.widget.Toast;
>>>>>>>>> Temporary merge branch 2

public class MainActivity extends AppCompatActivity {
    public static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"我是开发分支",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"我是开发分支666",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"我是开发分支877",Toast.LENGTH_LONG).show();
    }
}
