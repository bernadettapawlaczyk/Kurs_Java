package C_ZadanieRozdzialCzwartyInstrukcjeWarunkowe;

import java.util.Scanner;

public class NajwiekszaZTrzechLiczb {
    /*
    Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.
     */

    public static void main(String[] args) {
        System.out.println("Podaj pierwszą liczbę:");
        int liczba1 = getInt();
        System.out.println("Podaj drigą liczbę");
        int liczba2 = getInt();
        System.out.println("Podaj trzecią liczbę");
        int liczba3 = getInt();


    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
