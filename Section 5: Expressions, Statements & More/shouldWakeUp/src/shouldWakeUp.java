public class shouldWakeUp {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (!barking) {
            System.out.println("false");
        } else if ((barking && ((hourOfDay < 0) || hourOfDay > 23))) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        return barking;
    }
}
