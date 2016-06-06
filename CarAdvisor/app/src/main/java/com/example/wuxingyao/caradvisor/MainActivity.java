package com.example.wuxingyao.caradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CarExpert mCarExpert = new CarExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindCar(View view) {
        TextView textview = (TextView)findViewById(R.id.textView);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String carType = String.valueOf(spinner.getSelectedItem());
        textview.setText(carType);
        List<String> carList = mCarExpert.getCars(carType);
        StringBuilder carBuilder = new StringBuilder();
        for(String car : carList) {
            carBuilder.append(car).append("\n\n");
        }
        textview.setText(carBuilder);
    }

}

