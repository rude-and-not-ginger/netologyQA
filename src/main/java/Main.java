import org.example.sales.Sales;

public class Main {
    public static void main(String[] args) {
        Sales service = new Sales();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sumSales = service.calculateSumSales(sales);
        int averageSale = service.calculateAverageSale(sales);
        int maxSales = service.calculateMaxSales(sales);
        int minSales = service.calculateMinSales(sales);
        int monthAbove = service.monthsSalesAbove(sales);
        int monthBelow = service.monthsSalesBelow(sales);

        System.out.println(sumSales);
        System.out.println(averageSale);
        System.out.println(maxSales);
        System.out.println(minSales);
        System.out.println(monthAbove);
        System.out.println(monthBelow);


    }
}