//Write a program to check balance and withdraw money from ATM booth using switch case...

package class1;

import java.util.Scanner;

public class task8_try_with_switchcase {
    public static void main(String[] args) {
        int balance=15000;
        Scanner i=new Scanner(System.in);
        while(true)
        {
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for check balance");
            System.out.println("Choose 3 for EXIT");
            System.out.println("Choose the operation you want to perform:");
            int s=i.nextInt();
            switch(s)
            {
                case 1:
                    System.out.println("Enter money to be withdraw:");
                    int withdraw=i.nextInt();
                    if (balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("please collect your money...");
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Balance:"+balance);
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
