package com.company.strategy;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionStrategyData {
    ArrayList<Double> arr;

    public FunctionStrategyData(ArrayList<Double> _arr) {
        arr = new ArrayList<>(_arr);
//        arr.addAll(_arr);
    }

    public void display() {
        for (Double f: arr) {
            System.out.print(f + ", ");
        }
        System.out.println();
    }
}
