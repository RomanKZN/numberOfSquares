package ru.netology.numberOfSquares.services;

public class SqrtService {

    public int calcSqrt(int min, int max) {
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            if (i * i >= min && i * i <= max)

                count++;
        }
        return count;
    }

}



