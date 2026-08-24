package javaAssignment;

public class NumberAnalyzer {
    public static void main(String[] args) {
        // Calling Method 1
        System.out.println("--- Testing Method 1 --- ");
        printNumbersDescending();

        // Calling Method 2
        System.out.println("--- Testing Method 2 --- ");
        printEvenOrOdd();

        // Calling Method 3
        System.out.println("--- Testing Method 3 --- ");
        int testNumber = 5;
        System.out.println(checkNumberType(testNumber));

        // Calling Method 4
        System.out.println("--- Testing Method 4 --- ");
        int num1 = 10;
        int num2 = 20;
        System.out.println(calculateSum(num1, num2));

    }

    // Method 1 Definition
    /**
     * loops through the numbers from 1 to 10 then prints them descendingly
     */
    public static void printNumbersDescending(){
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }
    }

    // Method 2 Definition
    /**
     * loops through the numbers from 1 to 10 then prints the even ones labeled by Even and odd ones labeled by Odd sequentially
     */
    public static void printEvenOrOdd(){
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i + " -> Even");
            }else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    // Method 3 Definition
    /**
     * Checks if the inserted number is Positive, Negative, or Zero
     *
     * @param number the given number to be checked
     * @return "Positive" for numbers above Zero, "Negative" for numbers below Zero, and Zero for number Zero
     */
    public static String checkNumberType(int number){
        if(number > 0){
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        }else {
            return "Zero";
        }
    }

    // Method 4 Definition
    /**
     * Calculates the sum of two given numbers
     *
     * @param number1 the first given number
     * @param number2 the second given number
     * @return the calculated sum of the two numbers
     */
    public static int calculateSum(int number1, int number2){
        return number1 + number2;
    }

}
