import java.util.Scanner;

public class Job04 {

    // Méthode qui affiche la factorielle
    public static long factorielle(int n) {
        long resultat = 1; // initialiser le résultat

        System.out.print("Si ton N = " + n + ", alors " + n + "! = ");

        // Boucle pour multiplier les nombres de n jusqu'à 1
        for (int i = n; i >= 1; i--) {
            resultat *= i;

            // Affichage: nombre suivi de "×" sauf le dernier
            if (i > 1) {
                System.out.print(i + " × ");
            } else {
                System.out.print(i + " = ");
            }
        }

        return resultat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre N: ");
        int N = scanner.nextInt();

        long resultat = factorielle(N); // appel de la méthode

        System.out.println(resultat);

        scanner.close();
    }
}
