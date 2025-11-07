import java.util.Scanner;

public class Job09 {

    // Méthode qui gère saisie, vérification et affichage
    public static void nprsimpl() {
        Scanner scanner = new Scanner(System.in);
        int nombre = -1;
        boolean valide = false;

        // Boucle pour que l'utilisateur entre un entier positif
        while (!valide) {
            System.out.print("Entre un nombre entier positif : ");

            if (scanner.hasNextInt()) {
                nombre = scanner.nextInt();

                if (nombre >= 0) {
                    valide = true; // entrée valide
                } else {
                    System.out.println("Le nombre ne peut pas être négatif. Try again !");
                }
            } else {
                System.out.println("Ce n'est pas un nombre valide, try again !");
                scanner.next();
            }
        }

        // ni premier ni composé
        if (nombre == 0 || nombre == 1) {
            System.out.println("Ni premier ni composé");
            scanner.close();
            return;
        }

        int[] diviseurs = {2, 3, 5, 7};
        int i = 0;
        boolean pasPremier = false;

        // Boucle pour vérifier la divisibilité
        while (i < diviseurs.length) {
            if (nombre % diviseurs[i] == 0 && nombre != diviseurs[i]) {
                pasPremier = true;
                break;
            }
            i++;
        }

        if (pasPremier) {
            System.out.println("Pas premier");
        } else {
            System.out.println("Peut-être premier");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        nprsimpl();
    }
}
