package com.example.tayron.parcialexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    public void CAL(View view) {
        EditText num1 = (EditText) findViewById(R.id.numei);
        EditText num2 = (EditText) findViewById(R.id.numeii);
        TextView error = (TextView) findViewById(R.id.ERROR);
        TextView comp = (TextView) findViewById(R.id.comp);
        TextView suma = (TextView) findViewById(R.id.suma);
        TextView resta = (TextView) findViewById(R.id.resta);
        TextView mult = (TextView) findViewById(R.id.mult);
        TextView div = (TextView) findViewById(R.id.div);

        String snum1 = num1.getText().toString().trim();
        String snum2 = num2.getText().toString().trim();

        Integer numberI = Integer.parseInt(snum1);
        Integer numberII = Integer.parseInt(snum2);

        String message;

        if (iscero(numberI)) {
            message = "ERROR";

            error.setText(message);
        }
        String message2;

        if (iscero2(numberII)) {
            message2 = "ERROR";

            error.setText(message2);
        }
        if (numberI > numberII) {
            comp.setText("primernumeroesmayor");

        } else if (numberI < numberII) {
            comp.setText("segundo numero es mayor");

        } else if (numberI == numberII) {
            comp.setText("los numeros son iguales");
        }{
            int x = new Integer(num1.getText().toString());
            int y = new Integer(num2.getText().toString());
            int sum = x + y;

            suma.setText(sum);

            int rest = x - y ;

            resta.setText(rest);

            int MULTI = x*y ;

            mult.setText(MULTI);

            int DIVID = x/y;

            div.setText(DIVID);


        }
    }




    public boolean iscero(int numberI) {

        if (numberI == 0) {
            return true;
        } else {
            return false;
        }}


    public boolean iscero2(int numberII) {

        if (numberII == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void CLEAN (View view){
        EditText NUMI = (EditText) findViewById(R.id.numei);
        EditText NUMII = (EditText) findViewById(R.id.numeii);
        TextView ERR = (TextView) findViewById(R.id.ERROR);
        TextView COMP = (TextView) findViewById(R.id.comp);
        TextView SUM = (TextView) findViewById(R.id.suma);
        TextView REST = (TextView) findViewById(R.id.resta);
        TextView MULT = (TextView) findViewById(R.id.mult);
        TextView DIV = (TextView) findViewById(R.id.div);

        NUMI.setText("");
        NUMII.setText("");
        ERR.setText("");
        COMP.setText("");
        SUM.setText("");
        REST.setText("");
        MULT.setText("");
        DIV.setText("");
    }

}