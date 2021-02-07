package C_ZadanieRozdzialCzwartyInstrukcjeWarunkowe;

import java.util.Scanner;

public class CzyPelnoletni {
    /*
    Napisz program, który pobiera wiek od użytkownika.
    Zapisz w zmiennej typu boolean informację, czy użytkownik jest pełnoletni, czy nie.
    Skorzystaj z trój-argumentowego operatora warunkowego.
    Wypisz wynik zdefiniowanej zmiennej typu boolean na ekran.
     */

    public static void main(String[] args) {
        System.out.println("Podaj swój wiek:");
        int wiek = getInt();

        if(wiek >= 18){
            System.out.println("Jesteś pełnoletni!!");
        }
        else {
            System.out.println("Jesteś niepełnoletni!!");
        }

        // lub
        int wiekUzytkownika;
        boolean czyPełnoletni = true;
        System.out.println("Podaj swój wiek:");
        wiekUzytkownika = getInt();

        if(wiekUzytkownika >= 18){
            System.out.println("Jestesś pełnoletni");
        }
        else {
            System.out.println("Jesteś niepełnoletni!!");
        }

        czyPełnoletni = wiekUzytkownika>= 18 ? true :false;
        System.out.println("Czy pełnoletni " + czyPełnoletni);
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
