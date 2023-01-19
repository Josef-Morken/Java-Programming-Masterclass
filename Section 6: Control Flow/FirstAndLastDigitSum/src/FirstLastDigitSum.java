public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number){

        if (number < 0){
            return -1;
        }

        int total = 0;
        total = number % 10;

        if (number < 10){
            total = number * 2;
        }

        while (number != 0){
            number /= 10;
            if (number < 10){
                total += number;
            }

        }

        //System.out.println("The total is " + total);
        return total;
    }
}
