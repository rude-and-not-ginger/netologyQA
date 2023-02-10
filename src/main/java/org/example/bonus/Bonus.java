package org.example.bonus;

public class Bonus {
    public int bonusService(int phoneTopUp) {
        int topUpBonus = 100;
        int acquiredBonus = phoneTopUp / topUpBonus;
            if (phoneTopUp >= 1000) {
                acquiredBonus = phoneTopUp / topUpBonus;
                return acquiredBonus;
                } else {
                acquiredBonus = 0;
                return acquiredBonus;
            }  
        }
    }