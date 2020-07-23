package com.example.myapplication004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText Valor1;
    private EditText Valor2;
    private EditText Valor3;
    private EditText Valor4;
    private EditText Valor5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor1 = (EditText) findViewById(R.id.editTextNumber);
        Valor2 = (EditText) findViewById(R.id.editTextNumber2);
        Valor3 = (EditText) findViewById(R.id.editTextNumber3);
        Valor4 = (EditText) findViewById(R.id.editTextNumber4);
        Valor5 = (EditText) findViewById(R.id.editTextNumber5);
    }

    public void onClickBotonSumar(View view){
        Double a;
        Double b;
        Double c;
        Double d;
        Double suma;
        a = Double.parseDouble(Valor1.getText().toString());
        b = Double.parseDouble(Valor2.getText().toString());
        c = Double.parseDouble(Valor3.getText().toString());
        d = Double.parseDouble(Valor4.getText().toString());
        suma=a+b+c+d;
        Valor5.setText(suma.toString());
        Toast.makeText(this, "Valor de la SUMA: "+suma.toString(), Toast.LENGTH_SHORT).show();
    }

    public void onClickBotonRestar(View view){
        Double a;
        Double b;
        Double c;
        Double d;
        Double resta;
        a = Double.parseDouble(Valor1.getText().toString());
        b = Double.parseDouble(Valor2.getText().toString());
        c = Double.parseDouble(Valor3.getText().toString());
        d = Double.parseDouble(Valor4.getText().toString());
        resta=a-b-c-d;
        Toast.makeText(this, "Valor de la Resta: "+resta.toString(), Toast.LENGTH_SHORT).show();
    }

    public void onClickBotonMultiplicar(View view) {
        Double a;
        Double b;
        Double c;
        Double d;
        Double multiplicar;
        a = Double.parseDouble(Valor1.getText().toString());
        b = Double.parseDouble(Valor2.getText().toString());
        c = Double.parseDouble(Valor3.getText().toString());
        d = Double.parseDouble(Valor4.getText().toString());
        multiplicar=a*b*c*d;
        Toast.makeText(this, "Valor de la Multiplicar: "+multiplicar.toString(), Toast.LENGTH_SHORT).show();
    }

    public void onClickBotonDividir(View view) {
        Double a;
        Double b;
        Double c;
        Double d;
        Double dividir;
        a = Double.parseDouble(Valor1.getText().toString());
        b = Double.parseDouble(Valor2.getText().toString());
        c = Double.parseDouble(Valor3.getText().toString());
        d = Double.parseDouble(Valor4.getText().toString());
        dividir=a/b/c/d;
        Toast.makeText(this, "Valor de la Dividir: "+dividir.toString(), Toast.LENGTH_SHORT).show();
    }
}