//Write a program to get a number from the user and print whether it is positive or negative...
package class1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();


        if (num >=0) {
            System.out.println("the number is positive.");

        }
        else{
            System.out.println("the number is negative.");
        }
    }
}
