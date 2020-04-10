package com.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        int len = st.length();
        for (int i = 0; i < len; i++) {
            if (st.charAt(i) != st.charAt(len - i - 1)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
