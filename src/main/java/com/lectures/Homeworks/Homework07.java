package com.lectures.lecture07;

public class Homework07 {
    public static void main(String[] args) {
//        printArrayLenght();
//        NumbersFromArrayMultiplyTo5();
//        sumNumbersInTheArray();
//        printNumbersThatAreNotDivisibleTo3And7();
//        printNumbersFrom1ToN();
//        averageValueOfTheArrayElements();
//        printFibonacciNumbers();
    }



    private static void printArrayLenght() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(intArray.length);
    }



    private static void NumbersFromArrayMultiplyTo5() {
        int n=5;
        int [] intArray = new int [] {1,2,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int j : intArray) {
            System.out.println("Index " + j + " in array multiply to " + n + " is even to: " + j * n);
        }
    }



    private static void sumNumbersInTheArray() {
        int allNumbersInArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int oddNumbersSum = 0, evenNumbersSum = 0;
        for (int i = 0; i < 20; i++) {
            if (allNumbersInArray[i] % 2 == 0) {
                evenNumbersSum = evenNumbersSum + allNumbersInArray[i];
            } else {
                oddNumbersSum = oddNumbersSum + allNumbersInArray[i];
            }
        }
        System.out.println("Sum of the even numbers in the array is: " + evenNumbersSum);
        System.out.println("Sum of the odd numbers in the arrays is: " + oddNumbersSum);
    }



        private static void printNumbersThatAreNotDivisibleTo3And7() {
            for (int i = 1; i <= 10; i++) {
                if (i % 3 == 0 || i % 7 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }



    private static void printNumbersFrom1ToN(int i){
        int n = 10;
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }



    private static void averageValueOfTheArrayElements() {

        int[] numbers = new int[]{5, 10, 12, 27, 29, 30};
        int sum = 0;
        for (int number : numbers) sum = sum + number;
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is: " + average);
    }



    private static void printFibonacciNumbers() {

        int n = 3,
                x1 = 0,
                x2 = 1;
        System.out.print("First " + n + " Fibonacci numbers are: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(x1 + ",");

            int sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
    }
}