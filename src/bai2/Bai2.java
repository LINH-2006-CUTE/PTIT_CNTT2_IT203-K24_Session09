package bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.print("Chó kêu: ");
        myDog.sound();

        System.out.print("Mèo kêu: ");
        myCat.sound();
    }
}