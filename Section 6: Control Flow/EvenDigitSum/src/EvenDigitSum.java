public class EvenDigitSum {

    public static int getEvenDigitSum (int number){

        if (number < 0){
            return -1;
        }
        int total = 0;
        int oddChecker = 0;
        while (number != 0){
            oddChecker = number % 10;
            if (oddChecker % 2 == 0) {
                total += oddChecker;
            }
            number /= 10;
        }

        //System.out.println("The total is " + total);
        return total;
    }
}
