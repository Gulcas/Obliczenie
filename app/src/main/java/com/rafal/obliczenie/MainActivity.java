package com.rafal.obliczenie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // rzutowanie
        Button btn = (Button) findViewById(R.id.btnPolicz);
        final EditText et1 = (EditText) findViewById(R.id.etCena);
        final EditText et2 = (EditText) findViewById(R.id.etLiczba);
        final TextView result = (TextView) findViewById(R.id.wynik);

        // słuchacz
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cena = new Double (et1.getText().toString());
                int sztuki = new Integer (et2.getText().toString());
                double zaplata = cena * sztuki;
                result.setText("Zapłata: " + zaplata + " zł");
            }
        });
    }
}