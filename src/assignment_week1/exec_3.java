package assignment_week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class exec_3 {
    public static void main(String[] args) throws IOException {
//        Exercise 3: Print Multiplication Table
//        Objective: Print the multiplication table for a given number from 1 to 10.
//        Input: Enter a number, e.g., 7.
//        Output:
//        Multiplication Table for 7:
//        7 * 1 = 7
//        7 * 2 = 14
//        7 * 3 = 21
//        7 * 4 = 28
//        7 * 5 = 35
//        7 * 6 = 42
//        7 * 7 = 49
//        7 * 8 = 56
//        7 * 9 = 63
//        7 * 10 = 70
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Multiplication Table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
