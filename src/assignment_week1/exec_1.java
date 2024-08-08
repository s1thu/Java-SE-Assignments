package assignment_week1;

public class exec_1 {
    public static void main(String[] args) {

//        Exercise 1: Sum of Numbers
//        Calculate the sum of numbers from 1 to 10. Input: No input required.
//                Output:
//        The sum of numbers from 1 to 10 is: 55
        int total = 0;

        for (int i =1; i <= 10; i++) {
            total += i;
        }

        System.out.println("The sum of numbers from 1 to 10 is :" + total);
    }
}
