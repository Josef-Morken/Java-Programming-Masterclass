public class LargestPrime {

    public static int getLargestPrime (int number){

        if (number < 2 ){
            return -1;
        }

        int prime = 2;
        while (prime < number){
            if (number % prime != 0){
                prime++;
            } else {
                number /= prime;
            }
        }

        //below finds largest prime number in range
//        for (int i = 2; i < number; i++){
//            if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)){
//                prime = i;
//            }
//        }
        //System.out.println(prime);
        return prime;
    }
}
