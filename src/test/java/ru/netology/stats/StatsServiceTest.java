package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void salesAmountTest() {
        StatsService service = new StatsService();
        int[] sales = {10, 20, 30, 40};
        int expectedSales = 100;
        int actualSales = service.salesAmount(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void averageMonthSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {10, 10, 20, 40};
        int expectedAverageSales = 20;
        int actualAverageSales = service.averageMonthSales(sales);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void highestMonthSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {24, 12, 444, 54, 65, 22, 11, 68};
        int expectedHighestMonth = 3;
        int actualHighestMonth = service.highestMonthSales(sales);
        Assertions.assertEquals(expectedHighestMonth, actualHighestMonth);
    }

    @Test
    public void lowestMonthSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {24, 12, 444, 54, 65, 22, 11, 68};
        int expectedHighestMonth = 7;
        int actualHighestMonth = service.lowestMonthSales(sales);
        Assertions.assertEquals(expectedHighestMonth, actualHighestMonth);
    }

    @Test
    public void monthsLowerThanAverageTest() {
        StatsService service = new StatsService();
        int[] sales = {10, 10, 20, 40, 1};
        int expectedMonthsLowerAverage = 3;
        int actualMonthsLowerAverage = service.monthsLowerThanAverage(sales);
        Assertions.assertEquals(expectedMonthsLowerAverage, actualMonthsLowerAverage);

    }

    @Test
    public void monthsUpperThanAverageTest() {
        StatsService service = new StatsService();
        int[] sales = {10, 10, 20, 40, 1};
        int expectedMonthsUpperAverage = 2;
        int actualMonthsUpperAverage = service.monthsUpperThanAverage(sales);
        Assertions.assertEquals(expectedMonthsUpperAverage, actualMonthsUpperAverage);

    }


}
