package bai4;

import java.util.Scanner;

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Chó đang ăn thịt");
    }

    void sound() {
        System.out.println("Gâu gâu");
    }
}