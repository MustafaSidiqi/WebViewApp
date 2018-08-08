package com.example.mustafasidiqi.apptask1;

import android.content.Context;
import android.content.Intent;
import android.location.SettingInjectorService;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button webbtn, wifibtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button webbtn = (Button) findViewById(R.id.button);
        Button wifibtn = (Button) findViewById(R.id.wifi);

        webbtn.setOnClickListener(this);
        wifibtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
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

        if(view.getId() == R.id.wifi) {
            System.out.println("WIFI");
            Intent i = new Intent(Settings.ACTION_WIFI_SETTINGS);
        }
    }
}