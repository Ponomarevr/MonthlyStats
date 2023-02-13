package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public int salesAmount(int[] sales) {
        int salesSummary = 0;
        for (int sale : sales) {
            salesSummary = salesSummary + sale;
        }
        return salesSummary;
    }

    //средняя сумма продаж в месяц
    public int averageMonthSales(int[] sales) {
        int averageSales = salesAmount(sales) / sales.length;
        return averageSales;
    }

    //Номер месяца с пиком продаж
    public int highestMonthSales(int[] sales) {
        int highestMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[highestMonth]) {
                highestMonth = month;
            }
            month = month + 1;
        }
        return highestMonth + 1;
    }

    //номер месяца с минимумом продаж
    public int lowestMonthSales(int[] sales) {
        int lowestMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[lowestMonth]) {
                lowestMonth = month;
            }
            month = month + 1;
        }
        return lowestMonth + 1;
    }

    //количество месяцев с продажами ниже среднего
    public int monthsLowerThanAverage(int[] sales) {
        int monthsAmount = 0; //количество месяцев ниже среднего

        for (long sale : sales) {
            if (sale < averageMonthSales(sales)) {
                monthsAmount = monthsAmount + 1;
            }
        }
        return monthsAmount;

    }

    //количество месяцев с продажами выше среднего
    public int monthsUpperThanAverage(int[] sales) {
        int monthsAmount = 0; //количество месяцев выше среднего

        for (long sale : sales) {
            if (sale > averageMonthSales(sales)) {
                monthsAmount = monthsAmount + 1;
            }
        }
        return monthsAmount;

    }

}
