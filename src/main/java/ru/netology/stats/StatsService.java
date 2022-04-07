package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSum(long[] sales) {
        long average = 0;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateUnderAverage(long[] sales) {
        long average = calculateAverageSum(sales);
        int month = 0;
        for (long sale : sales)
            if (sale < average) {
                month = month + 1;
            }
        return month;
    }

    public int calculateOverAverage(long[] sales) {
        long average = calculateAverageSum(sales);
        int month = 0;
        for (long sale : sales)
            if (sale > average) {
                month = month + 1;
            }
        return month;
    }
}
