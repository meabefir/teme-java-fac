package com.company.strategy;

import java.util.ArrayList;

public class SquareFunction implements FunctionStrategy{
    @Override
    public Object execute(Object data) {
        ArrayList<Double> arr = ((FunctionStrategyData)data).arr;

        ArrayList<Double> res = new ArrayList<>();
        for (Double f: arr) {
            res.add(f * f);
        }

        return (Object)(new FunctionStrategyData(res));
    }
}
