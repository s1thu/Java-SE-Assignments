package assignment_week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exec_2 {
    public static void main(String[] args) throws IOException {
//        Exercise 2: Factorial Calculation
//        Calculate the factorial of a given number. Input: Enter a number, e.g., 5.
//        Output:
//        The factorial of 5 is: 120
        int total = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            total *= i;
        }

        System.out.println("The factorial of " + n + " is :" + total);
    }
}
