package com.homework;

public class Main {

    public static void main(String[] args) {
        SaveAccount.modifyRate(0.04);
        SaveAccount saver1, saver2;
        saver1 = new SaveAccount(2000);
        saver2 = new SaveAccount(3000);
        System.out.printf("saver1: %.2f\nsaver2: %.2f\n", saver1.calculate(), saver2.calculate());
    }
}
