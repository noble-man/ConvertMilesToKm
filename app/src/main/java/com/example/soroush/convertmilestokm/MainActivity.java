package com.example.soroush.convertmilestokm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConvMilesToKm = (Button) findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vMiles = Double.valueOf(textBoxMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));
            }
        });

        Button buttonConvKmToMiles = (Button) findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vKm = Double.valueOf(textBoxMiles.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));
            }
        });
    }
}
