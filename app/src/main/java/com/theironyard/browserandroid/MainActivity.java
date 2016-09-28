package com.theironyard.browserandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView web;
    Button back;
    Button forward;
    EditText addressBar;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        back = (Button) findViewById(R.id.back);
        web = (WebView) findViewById(R.id.web);
        forward = (Button) findViewById(R.id.forward);
    }
}
