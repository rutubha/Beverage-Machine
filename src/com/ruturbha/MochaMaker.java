package com.ruturbha;

public class MochaMaker extends  BeverageMaker{


    public String dispenseBeverage(){
        if(getAvailableBeverageCount()<=0){
            return "No more Mocha ";
        }
        updateBeverageQuantity();
        return "Enjoy a cup of Mocha with fresh!";
    }




}

