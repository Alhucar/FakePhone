package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    private TextView textNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        textNumero = (TextView)findViewById(R.id.textNumero);


    }




/*
    public void clicat(View v){
        Button boto =(Button) v;
        Log.i("click","Has clicat el boto");
    }
    */
    public void clkEsborra(View v) {
        Button boto = (Button) v;
        /*Log.i("click", "Has clicat el boto esborra");*/
        textNumero.setText("");    }

    public void clkTruca(View v) {
        Button boto = (Button) v;
        /*Log.i("click", "Has clicat el boto truca");*/
        Toast.makeText(FakePhoneActivity.this, "Trucant", Toast.LENGTH_LONG).show();    }

}
