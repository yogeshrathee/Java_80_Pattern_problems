package org.example.Patterns_80_Programs_In_Java;

import java.util.Scanner;


/*

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6 6 6
        7 7 7 7 7 7 7

*/

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        for(int i=1;i<=input;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
