package com.kritikothari.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText myText=(EditText) findViewById(R.id.RupeesAmountEditText);
        Double rupeesAmountDouble = Double.parseDouble(myText.getText().toString());
        Double dollarAmountDouble = 0.014*rupeesAmountDouble;
        Toast.makeText(MainActivity.this,"$ " + dollarAmountDouble,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
