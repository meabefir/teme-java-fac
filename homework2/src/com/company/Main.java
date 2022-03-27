package com.company;

import com.company.adapter.Body;
import com.company.adapter.BodyFunctionsFarenheit;
import com.company.facade.AnimalFacade;
import com.company.factory.AnimalFactory;
import com.company.factory.AnimalType;
import com.company.proxy.AnimalActionsProxyI;
import com.company.proxy.AnimalProxy;
import com.company.strategy.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        factory
        Animal a1 = AnimalFactory.makeAnimal(AnimalType.CAT, "mita", 2);
        Animal a2 = AnimalFactory.makeAnimal(AnimalType.DOG, "azorel", 3);

//        strategy

        FunctionStrategyData inputData = new FunctionStrategyData(new ArrayList<>(Arrays.asList(1., 2., 3.)));

        Strategy s = new DoubleFunction();
        FunctionStrategyData output = (FunctionStrategyData)s.execute(inputData);
        output.display();

        s = new SquareFunction();
        output = (FunctionStrategyData)s.execute(inputData);
        output.display();

        s = new SqrtFunction();
        output = (FunctionStrategyData)s.execute(inputData);
        output.display();

//        proxy

        Animal a3 = new Cat("mat", 3);
        AnimalProxy ap = new AnimalProxy(a3);
        ap.die();

        Animal a4 = new Cat("mat2", 13);
        AnimalProxy ap2 = new AnimalProxy(a4);
        ap2.die();

//        adapter

        Body b1 = new Body(36.5);
        BodyFunctionsFarenheit bf = new BodyFunctionsFarenheit(b1);
        System.out.println(bf.getTemperature());

//        facade

        AnimalFacade af = new AnimalFacade(a1);
        AnimalFacade af2 = new AnimalFacade(a2);
        af.live();
        af2.live();

    }
}
