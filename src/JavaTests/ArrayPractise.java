package JavaTests;

import java.util.HashSet;
import java.util.Set;

public class ArrayPractise {

        public static void main(String[] args) {

           // sumElements();
           // maxElement();
            //evenOddNums();
            //reverseArray();
            //removeDuplicates();
            removeDuplicates2();
        }

/**
 * Sum of All Elements
 *
 * Problem:
 * Write a program that calculates the sum of all the elements in an integer array.
 * Example Input: {1, 2, 3, 4, 5}
 * Expected Output: Sum = 15
 */
public static void sumElements(){

    int [] arr = { 8, 4, 7};
    int sum = 0;

    for(int i = 0; i < arr.length; i++){
        sum+= arr[i];
    }
    System.out.println("Sum is " + sum);
}

/**
 * Find the Maximum Element
             * Problem:
            * Write a program to find the largest number in an integer array.
            * Example Input: {10, 25, 8, 41, 30}
     * Expected Output: Max = 41
    */

public static void maxElement(){
    int arr [] = {45, 88, 98};
    int firstNum = arr[0];
    for(int i = 0; i<arr.length; i++){
        if(
            (arr[i] > firstNum)
        ){
            firstNum = arr[i];
        }
    }            System.out.println("Biggest num is " + firstNum);

}
 /*
 Count Even and Odd Numbers
     *
     * Problem:
     * Write a program that counts how many even and how many odd numbers are in an array.
     * Example Input: {1, 2, 3, 4, 5, 6}
     * Expected Output: Even: 3, Odd: 3
     *
  */

public static void evenOddNums(){
    int arr [] = { 3, 5, 8, 8,9,5};
int evenNum=0;
int oddNum=0;
    for (int i = 0; i< arr.length; i++){
        if(arr[i] % 2==0){
            evenNum++;   //arr[i] += evenNum;
        } else{
             oddNum++;
        }
    }
    System.out.println("Even Nums count are " + evenNum);
    System.out.println("Odd nums count are " + oddNum);
}


/*
Problem:
     * Reverse the elements of an array without using another array.
     * Example Input: {1, 2, 3, 4, 5}
     * Expected Output: {5, 4, 3, 2, 1}
 */

public static void reverseArray(){
    int arr [] = { 4, 7, 8, 9};

    for(int i = arr.length-1; i>= 0; i--){
        System.out.println( arr[i]);

    }
}
/*
Remove Duplicates From an Array
     *
     * Problem:
     * Write a program that removes duplicate values from an integer array (ignore sort order).
     * Example Input: {1, 2, 2, 3, 4, 4, 5}
     * Expected Output: {1, 2, 3, 4, 5}
     *
     * You can use a Set or manually check duplicates with nested loops (challenge yourself both ways).
     *
 */

    public static void removeDuplicates(){
        int arr [] = { 4, 7 ,8 ,8, 9, 7, 5};
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(5);
        System.out.println(set);

    }



    public static void removeDuplicates2() {
        int arr [] = { 4, 7 ,8 ,8, 9, 7, 5};
 Set <Integer> set = new HashSet<>();
for ( int i = 0; i<arr.length; i++){
    set.add(arr[i]);
}
        System.out.println(set);
    }















    }





