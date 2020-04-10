package com.homework;

public class SaveAccount {
    public static double rate;

    private double saving;

    public SaveAccount(double saving) {
        this.saving = saving;
    }

    public static void modifyRate(double rate) {
        SaveAccount.rate = rate;
    }

    public double calculate() {
        return saving += saving * rate / 12;
    }
}
