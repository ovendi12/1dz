package com.example.a1dz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textCount;
    private Button button;
    private int cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);

        textCount = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

    }

    public void onClick(View view) {
        cnt++;
        textCount.setText(Integer.toString(cnt));
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("sohranit", cnt);
        super.onSaveInstanceState(outState);

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        cnt = savedInstanceState.getInt("sohranit");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        textCount.setText(Integer.toString(cnt));
    }

}