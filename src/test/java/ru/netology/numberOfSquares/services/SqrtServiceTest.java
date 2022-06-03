package ru.netology.numberOfSquares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrtServiceTest {

    @Test
    public void shouldCalcExact1() {
        SqrtService service = new SqrtService();
        int expected = 4;
        int actual = service.calcSqrt(16);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact2() {
        SqrtService service = new SqrtService();
        int expected = 5;
        int actual = service.calcSqrt(25);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact3() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(36);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact4() {
        SqrtService service = new SqrtService();
        int expected = 7;
        int actual = service.calcSqrt(49);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact5() {
        SqrtService service = new SqrtService();
        int expected = 8;
        int actual = service.calcSqrt(64);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact6() {
        SqrtService service = new SqrtService();
        int expected = 9;
        int actual = service.calcSqrt(81);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact1() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(27);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcInexact2() {
        SqrtService service = new SqrtService();
        int expected = 10;
        int actual = service.calcSqrt(99);

        Assertions.assertEquals(expected, actual);

    }
}
