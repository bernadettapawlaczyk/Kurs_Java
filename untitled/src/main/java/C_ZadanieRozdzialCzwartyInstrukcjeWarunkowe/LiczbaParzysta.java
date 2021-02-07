package C_ZadanieRozdzialCzwartyInstrukcjeWarunkowe;

import java.util.Scanner;

public class LiczbaParzysta {
    /*
    Napisz program, który wczyta od użytkownika liczbę i wypisze, czy jest podzielna bez reszty przez 3.
    Skorzystaj z operatora reszty z dzielenia – jeżeli reszta z dzielenia jest równa 0, to liczba jest podzielna przez 3.
     */

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        int liczba = getInt();

        if(liczba % 3 == 0){
            System.out.println("Podana liczba jest podzielan przez 3");
        }
        else {
            System.out.println("Podana liczba nie jest podzielan przez 3");
        }
    }

    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
