import java.util.Scanner;

public class Job07 {

    // Méthode addition
    public static int calcSomme() {
        Scanner scanner = new Scanner(System.in);
        int somme = 0;
        int n;

        System.out.println("Enter numbers to add (0 to exit)");

        // Boucle qui continue tant que l'utilisateur n'entre pas 0
        while (true) {
            System.out.print("Number : ");
            n = scanner.nextInt();

            if (n == 0) {
                break; // Sortie de la boucle si 0
            }

            somme += n; // Ajout du nombre à la somme
        }

        return somme;
    }

    public static void main(String[] args) {
        // Appel de la méthode
        int sommeTotale = calcSomme();
        System.out.println("Total sum is : " + sommeTotale);
    }
}
