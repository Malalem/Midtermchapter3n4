package com.example.midtermchapter3n4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText number = (EditText) findViewById(R.id.amount);
        final TextView result = (TextView) findViewById(R.id.textView);
        final RadioButton Euro = (RadioButton) findViewById(R.id.Euro);
        final RadioButton mexican = (RadioButton) findViewById(R.id.mexican);
        final RadioButton canda = (RadioButton) findViewById(R.id.canada);
        final Button calc = (Button) findViewById(R.id.button);
        final Button next = (Button) findViewById(R.id.button2);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double Num = Double.parseDouble(number.getText().toString());
                Double converted;
                DecimalFormat tenth = new DecimalFormat("###,###.##");
                if (Euro.isChecked()){
                    if (Num < 100000){
                        converted = Num *1.16;
                        result.setText(tenth.format(Num)+ " USD= " + converted +" Euro ");
                    }
                }
                else if (mexican.isChecked()){
                    if (Num < 100000){
                        converted = Num *2;
                        result.setText(tenth.format(Num)+ " USD= " + converted +" Mexican Peso ");
                    }
                }
                else if (canda.isChecked()){
                    if (Num < 100000){
                        converted = Num *3;
                        result.setText(tenth.format(Num)+ " USD= " + converted +" Canadian Dollar ");
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Us Dollars input should be <10000",Toast.LENGTH_LONG).show();
                }
            }

        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Music.class));
            }
        });
    }
}