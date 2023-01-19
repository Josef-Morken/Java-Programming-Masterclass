public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double one, double two){

        if (one < 0 && two > 0){
            return false;
        }

        if (one > 0 && two < 0){
            return false;
        }
        double oneOne = (long)(one * 1e3) / 1e3;
        double twoTwo = (long)(two * 1e3) / 1e3;
        return oneOne == twoTwo;
    }
}
