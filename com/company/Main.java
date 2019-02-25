
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String space = "";

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 0; j < n - 2; j++) {
            space = space + " ";
        }
        for (int i = 0; i < n - 2; i++) {
            System.out.println("*" + space + "*");
        }
                for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}