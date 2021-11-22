package com.company;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");

        if (scanner.hasNextInt())
        {   n = scanner.nextInt();
            if (n > 0)
                for (int i = 0; i < n; i++) {

                    System.out.print(i * (-5) + " ");

                }
            else
                System.out.print("The number is not positive");}

        else

            System.out.println("Error type!");




    }
}
