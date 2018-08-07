package com.example.mustafasidiqi.apptask1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button webbtn = (Button) findViewById(R.id.button);
        webbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        EditText urlText = (EditText) findViewById(R.id.url);
        String url = String.valueOf(urlText.getText());
        WebView webview = (WebView) this.findViewById(R.id.webView);

        webview.getSettings().setJavaScriptEnabled(true);

        System.out.println("URL: " + url);
        webview.loadUrl(url);

        //Hiding keyboard
        InputMethodManager input = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        input.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
    }
}