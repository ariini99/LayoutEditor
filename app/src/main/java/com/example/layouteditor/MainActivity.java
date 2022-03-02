package com.example.layouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView ShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast!",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        count++;
        if (ShowCount != null)
            ShowCount.setText(Integer.toString(count));
    }
}
