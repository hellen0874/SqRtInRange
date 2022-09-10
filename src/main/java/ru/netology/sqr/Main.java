package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int lowerBorder = 99;
        int upperBorder = 300;

        int sqrtQuantity = service.sqrcalculate(lowerBorder, upperBorder);
        System.out.println("Количество чисел, квадраты которых входят в указанный диапазон: " + sqrtQuantity);
    }
}
