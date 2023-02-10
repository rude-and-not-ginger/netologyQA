package org.example.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ServiceSqrTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculate(String test, int lowerLimit, int upperLimit, int expectedCounter) {
        ServiceSqr service = new ServiceSqr();

        int actualCounter = service.sqrCounter(lowerLimit, upperLimit);

        assertEquals(expectedCounter, actualCounter);
    }
}