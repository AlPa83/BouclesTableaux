import java.util.Scanner;

public class Job02 {

    // Méthode qui calcule et affiche la suite de Fibonacci
    public static void fibonacci(int n) {
        int a = 0; // Premier nombre de la suite
        int b = 1; // Deuxième nombre de la suite

        System.out.print("La suite de Fibonacci est: ");

        // Boucle pour calculer et afficher les n premiers nombres
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int suivant = a + b; // Calcul du nombre suivant dans la suite
            a = b;               // Décalage : a devient l'ancien b
            b = suivant;         // Décalage : b devient le nouveau nombre calculé
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre N: ");
        int N = scanner.nextInt(); // Lecture de l'entier saisi par l'utilisateur

        fibonacci(N); // Appel de la méthode pour afficher la suite

        scanner.close();
    }
}
