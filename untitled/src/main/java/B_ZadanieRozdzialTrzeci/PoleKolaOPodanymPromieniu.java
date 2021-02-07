package B_ZadanieRozdzialTrzeci;

import java.util.Scanner;

public class PoleKolaOPodanymPromieniu {
    public static void main(String[] args) {

        /*Napisz program, który policzy pole koła o promieniu podanym przez użytkownika i wypisze wynik na ekran.
        Promień koła powinien być liczbą całkowitą – do jego przechowywania użyj zmiennej typu int.

         */

        int promien;
        double poleKola;

        System.out.println("Podaj promień koła: ");
        promien = getInt();
        poleKola = 3.14 * promien * promien;

        System.out.println(poleKola);
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
