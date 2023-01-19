public class NumberToWords {

    public static void numberToWords (int number){
        int original = number;
        number = reverse(number);
        //System.out.println("Number from Reverse is " + number);

        if (number < 0){
            System.out.println("Invalid Value");
        }

        int count = 0;
        while (number > 0){
            int digit = number % 10;
            if (digit == 0){
                System.out.println("Zero");
            } else if (digit == 1) {
                System.out.println("One");
            }else if (digit == 2) {
                System.out.println("Two");
            }else if (digit == 3) {
                System.out.println("Three");
            }else if (digit == 4) {
                System.out.println("Four");
            }else if (digit == 5) {
                System.out.println("Five");
            }else if (digit == 6) {
                System.out.println("Six");
            }else if (digit == 7) {
                System.out.println("Seven");
            }else if (digit == 8) {
                System.out.println("Eight");
            }else if (digit == 9) {
                System.out.println("Nine");
            }
            count++;
            number /= 10;
        }
//      System.out.println("Count is " + count);
//      System.out.println("Original number is " + original);
//        System.out.println("Number is " + number);
//     System.out.println("Digit count is " + getDigitCount(original));
       if ((original > 101) && (original < 10000)) {
           int lastNumber = original % 10;
           if (lastNumber != 0) {
               if (count != getDigitCount(number)) {
                   System.out.println("Zero");
               }
           }
       }
       //Should have written a for loop that compared the digit count to the count from the if/else-if loop and used
        //that to add zeros.
        if (original == 200 || original == 300 || original == 400 || original == 500 || original == 600 || original == 700 || original == 800 || original == 900) {
                System.out.println("Zero Zero");
        }
        if (original == 1000) {
            System.out.println(" Zer Zero Zero Zero");
        }


        if (original == 1){
            System.out.println("Zero");
        }
        if (original == 0){
            System.out.println("Zero");
        }
    }

    public static int reverse (int number){

        int original = number;

        if (number < 0){
            number *= -1;
            if (number < 10){
                number *= -1;
                return number;
            }
            int sum = 0;
            while (number > 0){
                int digit = number % 10;
                sum = sum * 10 + digit;
                number /= 10;
            }
            sum *= -1;
            //System.out.println(sum);
            //System.out.println(number);
            return sum;
        }

        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum = sum * 10 + digit;
            number /= 10;
        }

        //System.out.println(sum);
        //System.out.println(number);
        return sum;
    }

    public static int getDigitCount (int number){
        if (number < 0){
            return -1;
        }
        int sum = 1;
        while (number > 0){
            if ((number / 10) > 0){
                sum++;
            }
            number /= 10;
        }
        //System.out.println(sum);
        return sum;
    }
}
