import java.util.Scanner;

public class Job05 {

    // Méthode demande un nombre N à l'utilisateur et affiche un damier N×N alternant entre '#' et '-'.
    public static char damier(int ligne, int colonne) {
        if ((ligne + colonne) % 2 == 0) {
            return '#';
        } else {
            return '-';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // On demande à l'utilisateur la taille du damier
        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        // Boucle pour les lignes
        for (int i = 0; i < N; i++) {
            // Boucle pour les colonnes
            for (int j = 0; j < N; j++) {
                System.out.print(damier(i, j));
            }
            System.out.println();
        }

        scanner.close();
    }
}
