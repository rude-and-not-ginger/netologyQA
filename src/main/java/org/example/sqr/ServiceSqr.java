package org.example.sqr;
public class ServiceSqr {
    public int sqrCounter (int lowerLimit, int upperLimit) {
     int counter = 0;
            for (int i = 10; i <= 99 ; i++) {
                if (i * i >= lowerLimit && i * i <= upperLimit) {
                    counter++;
                }
            }
            return counter;
    }
}
