public class SumOddRange {
    public static boolean isOdd (int number){
        if (number < 0){
            return false;
        }

        if(number % 2 == 0){
            return false;
        }
        //System.out.println("true");
        return true;
    }

    public static int sumOdd (int start, int end){

        int sum = 0;

        if ((start < 1) || (end < 1)){
            return -1;
        }
        if(end < start){
            return -1;
        }

        for (int i=start; i<=end; i++){
            if (isOdd(i) == true){
                sum += i;
                //System.out.println("The sum is " + sum);
            }

        }
        //System.out.println("Sum is " + sum);
        return sum;
    }
}
