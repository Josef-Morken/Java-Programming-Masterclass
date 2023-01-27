//Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//XX represents the sum of all entered numbers of type int.
//YY represents the calculated average of all numbers of type long.

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage (){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int iterations = 0;

        while (true) {
            String nextNumber = scanner.nextLine();

            try{
                int number = Integer.parseInt(nextNumber);
                sum += number;
                iterations++;

            } catch (NumberFormatException nfe){
                break;
            }
        }
        int avg = (int) Math.round((double) sum / iterations);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
