package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtF, edtC;
    Button btnCF, btnFC, btnclear;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtC = findViewById(R.id.edtC);
        edtF = findViewById(R.id.edtF);
        btnCF = findViewById(R.id.btnCF);
        btnFC = findViewById(R.id.btnFC);
        btnclear = findViewById(R.id.btnclear);


        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int C = Integer.parseInt(edtC.getText().toString());
                Double F = C*1.8 + 32;
                edtF.setText(dcf.format(F)+"");

            }

            });

        btnFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int F = Integer.parseInt(edtF.getText().toString());
                Double C = (F-32)/1.8;
                edtC.setText(dcf.format(C)+"");

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtC.setText("");
                edtF.setText("");
            }
        });

    }
}