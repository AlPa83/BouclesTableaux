import java.util.Scanner;

public class Job10 {

    public static void menusimple() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            // Affichage du menu
            System.out.println("Menu :");
            System.out.println("1. Bonjour!");
            System.out.println("2. Au revoir!");
            System.out.println("3. Quitter");
            System.out.print("Faites votre choix : ");

            choix = scanner.nextInt();

            // Actions selon le choix
            switch (choix) {
                case 1:
                    System.out.println("Bonjour!");
                    break;
                case 2:
                    System.out.println("Au revoir!");
                    break;
                case 3:
                    System.out.println("Au revoir et à bientôt !");
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer!");
            }

            System.out.println();
        } while (choix != 3);

        scanner.close();
    }

    public static void main(String[] args) {
        menusimple(); // Appel de la méthode
    }
}

