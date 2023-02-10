package org.example.bonus;

public class BmiService {
    
    public double bmiCalculate (int height, int weight) {
        int bmiHeight = height * height;
        double bmiSquareHeight = (double) bmiHeight / 10_000; 
        double bmi = (double) weight / bmiSquareHeight;
        return bmi;
    }
}
