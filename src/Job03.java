import java.util.Scanner;

public class Job03 {

    // Méthode pour afficher la table de multiplication
    public static void multiplication(int nombre) {
/*                System.out.println("Table de multiplication de " + nombre + " :");

        // Boucle pour calculer et afficher chaque résultat
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }
    }
*/
     int[] table = new int[10]; // tableau pour stocker les résultats

        // Remplissage du tableau
        for (int i = 0; i < 10; i++) {
            table[i] = nombre * (i + 1);
        }

        // Affichage avec for-each
        int multiplier = 1; // pour suivre le multiplicateur
        for (int resultat : table) {
            System.out.println(nombre + " x " + multiplier + " = " + resultat);
            multiplier++; // on augmente le multiplicateur à chaque itération
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre: ");
        int N = scanner.nextInt();

        multiplication(N); // appel de la méthode

        scanner.close();
    }
}
