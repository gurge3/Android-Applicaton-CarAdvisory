package com.example.wuxingyao.caradvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuxingyao on 2016/6/5.
 */
public class CarExpert {
    List<String> getCars(String type) {
        List<String> cars = new ArrayList<>();
        if(type.equals("Electric Car")) {
            cars.add("Tesla Model-S");
            cars.add("BYD E6");
        } else if (type.equals("Sport Car")) {
            cars.add("Auston Martin V8 Vantage");
            cars.add("Posh 918");
        } else if (type.equals("SUV")) {
            cars.add("Audi Q5");
            cars.add("BMW X5");
        } else if (type.equals("Truck")) {
            cars.add("GMC SIERRA");
            cars.add("Jeep Grand C");
        }
        return cars;
    }
}
