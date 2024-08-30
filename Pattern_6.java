package org.example.Patterns_80_Programs_In_Java;

import java.util.Scanner;

/*

        7 6 5 4 3 2 1
        7 6 5 4 3 2
        7 6 5 4 3
        7 6 5 4
        7 6 5
        7 6
        7


*/

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        for(int i=1;i<=input;i++){
            for(int j=input;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
