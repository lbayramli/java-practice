package JavaTests;
import java.util.Scanner;

public class LoopPractise {
    public static void main(String[] args) {

       // printNums();
      // reverseString();
       // readNameScanner();
       // reverseWithScanner();
       // multiplicationTable();
       // sumOfFirstNumbers();
        primeNums();
    }

    //Write a program that prints the numbers from 1 to 10 using a for loop
        public static void printNums () {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }

        }

/**
 * Sum of First N Numbers
 * Ask the user for a number n, then calculate and print the sum of numbers from 1 to n using a while loop.
 */
public static void sumOfFirstNumbers(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ask for a num");
   int num = sc.nextInt();

    int i = 1;
    int sum = 0;
    while( i <= num){
        sum += i;
        i++;
    }
    System.out.println("Sum is " + sum);
    sc.close();
}

/**
 * Reverse a String
 * Ask the user for a word and print it backwards using a loop.
 */
public static void reverseString() {

    String word = "Training";
    String reversed = "";

    for( int i = word.length() - 1; i >= 0; i--){
        reversed = reversed + word.charAt(i); }
    System.out.println(reversed);
    System.out.println(word);
}

public static void reverseWithScanner(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ask a word ");
    String word = sc.next();

    String reverse= "";
for(int i = word.length()-1; i >= 0; i--){
    reverse= reverse + word.charAt(i);
}

    System.out.println("The word was " + word);
    System.out.println("reversed word is " + reverse);
    sc.close();

}

/**
 * Multiplication Table
 * Ask the user for a number and print its multiplication table from 1 to 10.
 */
public static void multiplicationTable(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ask for a number");
    int num = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
        System.out.println(num * i);
    }

    sc.close();
}

public static void primeNums() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();

    for (int i = 2; i <= num; i++) {
        int n;
        for (n = 2; n < i; n++) {
            if (i % n == 0) {
                System.out.println(i + " is NOT a prime number");
                break;
            }}
        if (n == i) {
            System.out.println(i + " is a prime number");
        }
    }
}

public static void readNameScanner(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter ur name: ");
    String name = sc.next();

    sc.nextLine();
    System.out.println("Enter your age ");
    int n = sc.nextInt();

    System.out.println("Name is " + name);
    System.out.println("the age is " + n);
}









}



