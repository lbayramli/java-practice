package JavaTests;

public class Test1 {
    public static void main(String[] args) {
checkEvenOrOdd(5);
checkPositiveOrNegative(8);
checkBiggerOrSmaller(16);
findLargest(45,21,89);
printMultiplicationTable(8);
    }
    //Write a method that takes an integer as input and prints whether it’s even or odd.
    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + "  is even");
        } else {
            System.out.println(number + "  is odd");
        }

        System.out.println(number);
    }

    public static void checkBiggerOrSmaller(int number){
        if(number < 8){
            System.out.println(number + "is smaller than 8"  );
        } else if (number > 8) {
            System.out.println(number + " is bigger than 8" );
        }
    }

    public static void checkPositiveOrNegative(int number){
        if (number < 0){
            System.out.println(number + " is negative");
        }else if(number > 0){
            System.out.println(number + " is positive");
        }
    }

    public static void findLargest(int a, int b, int c) {
        if(a > b && a > c) {

            System.out.println(a + " is bigger than" + b + " and " + c);
        }
       else if(b > a && b > c) {
            System.out.println(b + " is bigger than" + a + " and " + c);
        }
            else if(c > a && c > b){
                System.out.println(c + " is bigger than" + a + " and " + b);
            }
            else if(a==b && b==c)
                System.out.println("nmbers are equal");
        }

        //LOOP
    //Write a program that prints the multiplication table of a number (e.g., 5).

    public static void printMultiplicationTable(int number){
        for(int i = 1; i<=10; i++){
int result = number * i;
            System.out.println(number + " x " + i + " = " + result);

        }


    }












}
