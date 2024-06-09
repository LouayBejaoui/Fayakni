 package com.example.fayakni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import ;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         Button but = findViewById(R.id.SetButton);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button) findViewById(R.id.timeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager() ,"time picker");
            }
        });
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(this , MainActivity.class);

                startActivity(i);
            }

        });
        }
     public void displayToast (View v){
         Toast.makeText(MainActivity.this,"Alarm is set" , Toast.LENGTH_SHORT).show();
     }

     @Override
     public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
         TextView textView=(TextView)findViewById(R.id.timeText);
         textView.setText(hourOfDay+":"+minute);

     }


 }
