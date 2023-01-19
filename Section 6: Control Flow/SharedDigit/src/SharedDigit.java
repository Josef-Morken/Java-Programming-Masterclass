public class SharedDigit {

    public static boolean hasSharedDigit (int first, int second){

        if ((first < 10) || (second < 10)){
            return false;
        }

        if ((first > 99) || (second > 99)){
            return false;
        }

        int firstA = first % 10;
        int firstB = first / 10;
        int secondA = second % 10;
        int secondB = second / 10;

        if ((firstA == secondA) || (firstA == secondB)){
            return true;
        }
        if ((firstB == secondA) || (firstB == secondB)){
            return true;
        }
        return false;
    }
}
