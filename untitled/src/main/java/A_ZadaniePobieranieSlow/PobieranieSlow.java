package A_ZadaniePobieranieSlow;

import java.util.Scanner;

public class PobieranieSlow {
    public static void main(String[] args) {

        String pierwsze, drugie, trzecie;

        System.out.println("Podaj pierwsze słowo: ");
        pierwsze = getString();

        System.out.println("Podaj drugie słowo: ");
        drugie = getString();

        System.out.println("Podaj trzecie słowo: ");
        trzecie = getString();

        System.out.println("Podanie słów w odwrotnej kolejności: " + trzecie + " " + drugie + " " + pierwsze);

    }

    public static String getString(){
        return new Scanner(System.in).next();
    }
}
