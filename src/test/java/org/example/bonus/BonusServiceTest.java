package org.example.bonus;

import org.example.bonus.BonusService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void ShouldCalculateRegisteredAndBonusNotLimited() {
        BonusService service = new BonusService();

        // prepare data
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        //call method
        long actual = service.calculate(amount, registered);

        //checking results
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateRegisteredAndBonusLimited() {
        BonusService service = new BonusService();

        // prepare data
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        //call method
        long actual = service.calculate(amount, registered);

        //checking results
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateNotRegisteredAndBonusNotLimited() {
        BonusService service = new BonusService();

        // prepare data
        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        //call method
        long actual = service.calculate(amount, registered);

        //checking results
        assertEquals(expected, actual);
    }
    @Test
    void ShouldCalculateNotRegisteredAndBonusLimited() {
        BonusService service = new BonusService();

        // prepare data
        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        //call method
        long actual = service.calculate(amount, registered);

        //checking results
        assertEquals(expected, actual);
    }
}