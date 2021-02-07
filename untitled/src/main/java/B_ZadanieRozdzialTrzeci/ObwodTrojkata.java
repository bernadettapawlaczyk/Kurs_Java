package B_ZadanieRozdzialTrzeci;

import java.util.Scanner;

public class ObwodTrojkata {
    /*Napisz program, który pobierze od użytkownika trzy boki trójkąta, policzy jego obwód i wypisze wynik na ekran.

     */
    public static void main(String[] args) {

        int x, y, z;
        int obwodTrojkata;

        System.out.println("Podaj pierwszy bok trójkąta: ");
        x= getInt();

        System.out.println("Podaj drugi bok trójkąta: ");
        y = getInt();

        System.out.println("Podaj trzeci bok trójkąta: ");
        z = getInt();

        obwodTrojkata = x + y + z;

        System.out.println("Obwoj trójkąta o podanych bokach wynosi: " + obwodTrojkata);
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
