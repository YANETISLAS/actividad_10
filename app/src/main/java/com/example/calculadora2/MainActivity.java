package com.example.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_resultado2;
    EditText et_numero1;
    EditText et_numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numero1=(EditText)findViewById(R.id.et_numero1);
        et_numero2=(EditText)findViewById(R.id.et_numero2);
        tv_resultado2 = (TextView)findViewById(R.id.tv_resultado2);

    }
    public void suma (View v){
        float numero1 = Float.parseFloat(et_numero1.getText().toString());
        float numero2 = Float.parseFloat(et_numero2.getText().toString());
        float resultado = numero1 + numero2;
        tv_resultado2.setText(String.valueOf(resultado));
    }
    public void resta(View v){
        float numero1 = Float.parseFloat(et_numero1.getText().toString());
        float numero2 = Float.parseFloat(et_numero2.getText().toString());
        float resultado = numero1 - numero2;
        tv_resultado2.setText(String.valueOf(resultado));
    }
    public void division(View v){
        float numero1 = Float.parseFloat(et_numero1.getText().toString());
        float numero2 = Float.parseFloat(et_numero2.getText().toString());
        float resultado = numero1 / numero2;
        tv_resultado2.setText(String.valueOf(resultado));
    }
    public void multiplicacion(View v){
        float numero1 = Float.parseFloat(et_numero1.getText().toString());
        float numero2 = Float.parseFloat(et_numero2.getText().toString());
        float resultado = numero1 * numero2;
        tv_resultado2.setText(String.valueOf(resultado));
    }
    public void modulo(View v){
        float numero1 = Float.parseFloat(et_numero1.getText().toString());
        float numero2 = Float.parseFloat(et_numero2.getText().toString());
        float resultado = numero1 % numero2;
        tv_resultado2.setText(String.valueOf(resultado));
    }

}
