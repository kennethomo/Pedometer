package com.example.pedometer;

public class GetSet {
    private int numSteps = 0;

    public int getStep(){
        return numSteps;
    }

    public void setStep(int newStep){
        this.numSteps = newStep;
    }
}
