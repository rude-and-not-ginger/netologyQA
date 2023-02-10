package org.example.sales;

public class Sales {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSale(int[] sales) {
        int averageSale = calculateSumSales(sales) / sales.length;

        return averageSale;
    }

    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsSalesBelow(int[] sales) {
        int counterMonth = 0;
        for (int sale : sales) {
            if (sale < calculateAverageSale(sales)) {
                counterMonth ++;
            }
        }
        return counterMonth;
    }
    public int monthsSalesAbove(int[] sales) {
        int counterMonth = 0;
        for (int sale : sales) {
            if (sale > calculateAverageSale(sales)) {
                counterMonth ++;
            }
        }
        return counterMonth;
    }
}
