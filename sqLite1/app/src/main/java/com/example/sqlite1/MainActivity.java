package com.example.sqlite1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btn , btnVeiw;
    EditText personAge, personName;
    Switch s;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btnVeiw=findViewById(R.id.button2);
        personName=findViewById(R.id.editTextTextPersonName);
        personAge=findViewById(R.id.editTextNumber);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomModel customModel=new CustomModel(personName.getText().toString(),Integer.parseInt(personAge.toString()),1,s.isChecked());

            }
        });

        btnVeiw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



}