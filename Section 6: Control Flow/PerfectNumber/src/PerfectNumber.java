public class PerfectNumber {

    public static boolean isPerfectNumber (int number){
        if (number < 1){
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++){
            int digit = number % i;
            if (digit == 0)
                sum += i;
        }
        //System.out.println(sum);
        if (sum == number){
            //System.out.println("true");
            return true;
        }else return false;

    }
}
