package com.example.pharmassist.store.products;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pharmassist.R;

public class Product1 extends AppCompatActivity {
    TextView value;
    int count = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product1);

             value = (TextView) findViewById(R.id.value1);

        }
        public void increment(View v)
        {
            count++;
            value.setText("" + count);

        }

        public void decrement(View v){

        if (count <= 1){
            count =0;

        }
        else count--;
        value.setText("" + count);
        }

}
