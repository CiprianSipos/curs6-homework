package ro.fasttrackit.curs6homework;

import java.util.Scanner;
import java.lang.Math;

public class Course6Homework {
    public static void main(String[] args){
        int[] numbers = new int[]{1, 25, 54, 75, 23, 5, 4, 9};
        System.out.println("Sum of the elements is: " + sumOfElements(numbers));
        System.out.println("There are " + oddElements(numbers)+ " odd elements");

        Scanner input = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int n = input.nextInt();
        System.out.println("Elements greater than "+ n+" are: ");
        checkIfGreater(numbers,n);
        System.out.println("--------");

        //int targetAmount;
        //System.out.println(randomDonation(100));

        System.out.println("--------");
        //targetedAmount(100);

        String s= "Scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.Donatiile se vor face cu ajutorul obiectului Random.Primim donatii pana cand ajungem la suma dorita.Cand ajungem la suma dorita afisam un mesaj de succes";

        phrase(s);

    }
    public static void phrase(String s){
        String[] arraySplit= s.split("\\.");
        for (int i =0;i<arraySplit.length;i++){
            System.out.println(arraySplit[i]);
        }

    }


    public static int randomDonation(int targetAmount){
        double d=Math.random()*targetAmount;
        int donation = (int)d;
        return donation;
    }

    public static int sumOfElements(int[] numbers){
        int sum = 0;
        for(int i :numbers){
            sum+=i;
        }
        return sum;
    }
    public static int oddElements(int[] numbers){
        int count=0;
        for(int i:numbers){
            if(i%2 != 0){
                count++;
            }
        }return count;
    }
    public static void checkIfGreater(int[] numbers, int n){
        for(int i : numbers){
            if(i>n){
                System.out.println(i);
            }
        }
    }
}
