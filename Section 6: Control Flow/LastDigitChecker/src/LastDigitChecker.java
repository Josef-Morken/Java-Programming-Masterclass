public class LastDigitChecker {

    public static boolean hasSameLastDigit (int first, int second, int third){

        if ((first < 10) || (second < 10) || (third < 10)){
            return false;
        }

        if ((first > 1000) || (second > 1000) || (third > 1000)){
            return false;
        }

        if (((first % 10) == (second % 10)) || ((first % 10) == (third % 10))){
            return true;
        }

        if (((second % 10) == (first % 10)) || ((second % 10) == (third % 10))){
            return true;
        }

        return false;
    }

    public static boolean isValid (int fourth){
        if ((fourth < 10) || (fourth >1000)){
            return false;
        }
        return true;
    }
}
