package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.averageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 6;
        int actual = service.maxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBelowAverageSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAverageSalesMonths(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAboveAverageSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveAverageSalesMonths(sales);

        assertEquals(expected, actual);
    }


}
