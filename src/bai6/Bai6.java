package bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Circle(5.5);
        shapes[2] = new Rectangle(4);
        shapes[3] = new Rectangle(3, 6);

        double totalArea = 0;
        for (Shape s : shapes) {
            double a = s.area();
            totalArea += a;
            System.out.printf("Hình: %-10s, Diện tích: %8.2f%n", s.getClass().getSimpleName(), a);
        }
        System.out.printf("TỔNG DIỆN TÍCH: %f", totalArea);

    }
}