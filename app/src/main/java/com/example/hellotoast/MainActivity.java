package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView ShowCount;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount=(TextView) findViewById(R.id.show_count);
        resetButton=(Button) findViewById(R.id.button);



    }
    public void ShowToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view){
        count++;
        if (ShowCount !=null)
            ShowCount.setText(Integer.toString(count));
        if((count % 2) ==0){
            resetButton.setBackgroundColor(Color.BLACK);
        }
        if((count % 2) !=0)
        {
            resetButton.setBackgroundColor(Color.MAGENTA);
        }

    }


    public void reset(View view) {
        ShowCount.setText("0");
        count =0;
        resetButton.setBackgroundColor(Color.GRAY);

    }
}