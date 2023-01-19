public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second){

        if ((first < 10) || (second < 10)){
            return -1;
        }

        int third = 0;
        if (first < second){
            third += first;
        } else third += second;
//        System.out.println(third);

        int gcd = 0;
        for (int i = 1; i <= third; i++){
            if ((first % i == 0) && (second % i == 0)){
                gcd = i;
            }
        }
        //System.out.println("gcd " + gcd);
        return gcd;
    }
}
