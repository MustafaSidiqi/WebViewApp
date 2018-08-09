package com.example.mustafasidiqi.apptask1;

        import android.content.Intent;
        import android.os.Bundle;
        import android.provider.Settings;
        import android.support.v4.app.Fragment;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;

public class activity_2 extends AppCompatActivity implements View.OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_2);

                Button mainBtn = (Button) findViewById(R.id.mainButton);
                Button mainBtn2 = (Button) findViewById(R.id.mainButton_2);

                mainBtn.setOnClickListener(this);
                mainBtn2.setOnClickListener(this);



        }

        @Override
        public void onClick(View view) {
            if(view.getId() == R.id.mainButton) {
                Fragment f = new fragment_1();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frameLayout, f)
                        .addToBackStack(null)
                        .commit();
            }

            if(view.getId() == R.id.mainButton_2) {
                Fragment f = new fragment_2();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frameLayout, f)
                        .addToBackStack(null)
                        .commit();
            }


        }
}
