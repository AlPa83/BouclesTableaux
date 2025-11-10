import java.util.Scanner;

public class Job18 {

    // Méthode qui gère toute la saisie et l'affichage du tableau
    public static void entry() {
        Scanner scanner = new Scanner(System.in);
        int taille = 0;

        // Boucle pour demander la taille du tableau
        while (true) {
            System.out.print("Combien de nombres voulez-vous entrer (maximum 10) ? ");

            if (scanner.hasNextInt()) { // On Vérifie si l'entrée est un entier
                taille = scanner.nextInt(); // On lit l'entier
                if (taille >= 1 && taille <= 10) { // On vérifie que l'entier est entre 1 et 10
                    break;
                } else {
                    System.out.println("Erreur : entrez un nombre entre 1 et 10.");
                }
            } else {
                System.out.println("Erreur : veuillez entrer un nombre entier !");
                scanner.next();
            }
        }

        // On crée le tableau avec la taille saisie
        int[] nombres = new int[taille];

        // Boucle pour remplir le tableau
        for (int i = 0; i < taille; i++) {
            while (true) {
                System.out.print("Entrez le nombre " + (i + 1) + " : ");

                if (scanner.hasNextInt()) { // On vérifie que l'entrée est un entier
                    nombres[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Erreur : veuillez entrer un nombre entier !");
                    scanner.next();
                }
            }
        }

        // Affichage du tableau
        System.out.print("Tableau = [");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }


    public static void main(String[] args) {
        entry(); // Appel de la méthode
    }
}

