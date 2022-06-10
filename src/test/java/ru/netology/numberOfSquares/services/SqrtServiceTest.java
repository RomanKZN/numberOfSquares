package ru.netology.numberOfSquares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int expected = 6;
        int actual = service.calcSqrt(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSqrtBorders() {
        SqrtService service = new SqrtService();

        int expected = 7;
        int actual = service.calcSqrt(9, 100);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSqrtBorders1() {
        SqrtService service = new SqrtService();

        int expected = 0;
        int actual = service.calcSqrt(100, 200);

        Assertions.assertEquals(expected, actual);
    }
}


