public class NumberPalindrome {

    public static boolean isPalindrome (int number ){

        int reverse = 0;
        int original = number;
        if (number < 0){
            number *= -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reverse += lastDigit;
            reverse *= 10;
            number /= 10;
        }
        reverse /= 10;

        if (original < 0){
            reverse *= -1;
        }

        System.out.println("original = " + original);
        System.out.println("reverse = " + reverse);

        if (original == reverse){
            return true;
        }


        return false;
    }
}
