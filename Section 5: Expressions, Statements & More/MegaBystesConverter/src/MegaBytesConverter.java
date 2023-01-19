public class MegaBytesConverter {

    public static int toMegaBytesAndKiloBytes (int kiloBytes){

        if (kiloBytes < 0 ){
            return -1;
        }
        return (kiloBytes % 1024);

    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) +" MB and " + (kiloBytes % 1024) + " KB");
        }

    }
}
