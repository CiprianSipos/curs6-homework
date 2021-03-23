package ro.fasttrackit.curs6homework;

import java.util.Scanner;

public class TR11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number: ");
       int n=scanner.nextInt();
       boolean even=isEven(n);

        System.out.println(even);

    }
    public static boolean isEven(int n){
        return n % 2 == 0;

    }
}