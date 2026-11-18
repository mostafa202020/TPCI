package dz.univ.calculatrice;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Operation addition = new AddOperation();
        Operation subtraction = new SubtractOperation();

        System.out.println("===== CALCULATRICE CLI =====");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");

        System.out.print("Votre choix : ");
        int choice = scanner.nextInt();

        System.out.print("Premier nombre : ");
        double first = scanner.nextDouble();

        System.out.print("Deuxieme nombre : ");
        double second = scanner.nextDouble();

        double result;

        if (choice == 1) {
            result = addition.execute(first, second);
            System.out.println("Resultat : " + result);

        } else if (choice == 2) {
            result = subtraction.execute(first, second);
            System.out.println("Resultat : " + result);

        } else {
            System.out.println("Choix invalide !");
        }

        scanner.close();
    }
}