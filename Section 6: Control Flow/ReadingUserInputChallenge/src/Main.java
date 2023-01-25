//In this challenge, you'll read 5 valid numbers from the console, entered by the user and print the sum
//Validate the integers, print out "Invalid Number" if invalid but continue looping until there are 5
//Prompt the user with "Enter number #X" for each entry, with X being 1,2,3,etc.
//"Enter number #1:" then "Enter number #2:" and so on

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //allow user input reading
        int counter = 1;
        //counter starts at one because the print.ln will ask the user for "number #"
        double sum = 0;
        //double will allow partial numbers to be used as well

        while (counter <= 5){
            System.out.println("Enter number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try  {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
                //if user input is not a number this should catch it
            }
        }

        System.out.println("The sum of the 5 numbers is = " + sum);
    }
}