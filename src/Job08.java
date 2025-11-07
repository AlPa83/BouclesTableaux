import java.util.Scanner;

public class Job08 {

    // Méthode qui affiche le nombre de chiffres
    public static void digitcount() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean valide = false;

        // Boucle jusqu'à ce que l'utilisateur entre un nombre entier
        while (!valide) {
            System.out.print("Entre un nombre : ");
            if (scanner.hasNextInt()) {
                nombre = scanner.nextInt();
                valide = true;
            } else {
                System.out.println("Ce n'est pas un nombre valide, try again !");
                scanner.next();
            }
        }

        int counter = 0;

        // Si le nombre est négatif, on le rend positif
        if (nombre < 0) {
            nombre = -nombre;
        }

        // Si le nombre est 0, il contient 1 chiffre
        if (nombre == 0) {
            counter = 1;
        } else {
            // Boucle pour compter les chiffres
            while (nombre > 0) {
                nombre = nombre / 10;
                counter++;
            }
        }

        System.out.println("Ton numéro contient " + counter + " chiffres.");
        scanner.close();
    }

    public static void main(String[] args) {
        digitcount(); // Appel de la méthode
    }
}
