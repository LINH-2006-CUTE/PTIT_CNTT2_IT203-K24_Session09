package bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.sound();
        }

    }
}