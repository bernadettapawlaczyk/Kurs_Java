package B_ZadanieRozdzialTrzeci;

import java.util.Scanner;

public class DlugoscZnakow {
    public static void main(String[] args) {

        String slowo;

        System.out.println("Podaj słowo: ");
        slowo = getString();

        System.out.println(slowo + " Długość tego słowa to " + slowo.length() + " liretek");
    }

    public static String getString(){

        return new Scanner(System.in).next();
    }
}
