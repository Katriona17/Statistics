package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void shouldCalculateSum() {
        long expected = 180;
        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        long expected = 15;
        long actual = service.calculateAverageSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSales() {
        long expected = 8;
        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findMinSales() {
        long expected = 9;
        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findCalcUnderAverage() {
        long expected = 5;
        long actual = service.calculateUnderAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void findCalcOverAverage() {
        long expected = 5;
        long actual = service.calculateOverAverage(sales);

        assertEquals(expected, actual);
    }
}