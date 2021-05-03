package oczko;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************** WITAJ W KULTOWEJ GRZE OCZKO ********************************");
        System.out.println("******************** NA POCZĄTEK POROSZĘ ABYŚ PODAŁ ILOŚC GRACZY ( 2 - 4 ) **************");

        System.out.println("Podaj ilość graczy");
        int iloscGraczy = scanner.nextInt();
        if (2 == iloscGraczy) {
            System.out.println("Podaj imię pierwszego gracza");
            String name1 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 1  " +  name1);

            System.out.println("Podaj imię drugiego gracza");
            String name2 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 2 " + name2);
        }
        if (iloscGraczy == 3) {
            System.out.println("Podaj imię pierwszego gracza");
            String name1 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 1 " + name1);
            System.out.println("Podaj imię drugiego gracza");
            String name2 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 2 " + name2);
            System.out.println("Podaj imię trzeciego gracza");
            String name3 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 3  " + name3);
        }
        if (iloscGraczy == 4) {
            System.out.println("Podaj imię pierwszego gracza");
            String name1 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 1 " + name1);
            System.out.println("Podaj imię drugiego gracza");
            String name2 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 2 " + name2);
            System.out.println("Podaj imię trzeciego gracza");
            String name3 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 3 " + name3);
            System.out.println("Podaj imię czwartego gracza");
            String name4 = scanner.nextLine();
            System.out.println("Jesteś graczem nr 4 " + name4);
        }
        else {
            System.out.println(" Liczba graczy jest ograniczona przedziałem od 2 do 4 ");
        }
    }
}

