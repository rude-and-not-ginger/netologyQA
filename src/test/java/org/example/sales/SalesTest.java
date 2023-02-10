package org.example.sales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    @Test
    void shouldCalculateSum() {
        Sales service = new Sales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        Sales service = new Sales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMonthNumberMaxSale() {
        Sales service = new Sales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowMonthNumberMinSale() {
        Sales service = new Sales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowCounterMonthSaleBelow() {
        Sales service = new Sales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsSalesBelow(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldShowCounterMonthSaleAbove() {
        Sales service = new Sales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsSalesAbove(sales);

        assertEquals(expected, actual);
    }
}