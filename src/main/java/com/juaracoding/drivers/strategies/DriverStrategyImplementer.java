package com.juaracoding.drivers.strategies;

public class DriverStrategyImplementer {

    //diunakan untuk memili chrome atau firefox nya
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case "chrome":
                return new Chrome();
            case "firefox":
                return new Firefox();
            default:
                return null;
        }
    }
}
