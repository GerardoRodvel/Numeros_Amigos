package com.e.actividad2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtA = findViewById(R.id.txtA);
        final TextView txtB = findViewById(R.id.txtB);
        final Button btnCalcular =findViewById(R.id.btnCalcular);
        final TextView txtResult = findViewById(R.id.btnResult);


        /*  1184,   1210
            2620,   2924
            5020,   5564
            6232,   6368
            10744, 10856
            12285, 14595
            17296, 18416
        */


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double a = Double.parseDouble(txtA.getText().toString());
                double b = Double.parseDouble(txtB.getText().toString());
                double suma = 0;

                for(int i=1; i<a; i++){  // for para sumar todos los divisores propios de a
                    if(a %i==0){
                        suma=suma+i;
                    }
                }
                // si la suma de los divisores de a es igual a b
                if(suma==b){
                    suma=0;
                    for(int i=1;i<b;i++){  // sumo los divisores propios de b
                        if(b%i==0){
                            suma=suma+i;
                        }
                    }
                    // si la suma de los divisores de b es igual a a
                    if(suma==a){
                        txtResult.setText("SI");
                    }else{
                        txtResult.setText("NO");
                    }
                }
                else{
                    txtResult.setText("NO");
                }
            }

        });


    }
}
