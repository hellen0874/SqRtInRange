package ru.netology.sqr;

public class SQRService {
    public int sqrcalculate(int lowerBorder, int upperBorder) {
        int sqrtQuantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBorder & i * i <= upperBorder)
                sqrtQuantity = sqrtQuantity + 1;
        }
        return sqrtQuantity;
    }

}
