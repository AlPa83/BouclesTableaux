import java.util.Scanner;

public class Job10bonus {

    public static void menusimple() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("===== VEUILLEZ VOTER MAINTENANT =====");
            System.out.println("1. \uD83D\uDD35 Continuer à jouer");
            System.out.println("2. ❌ Tu veux arrêter de jouer");
            System.out.println("3. ❌ Quitter définitivement le jeu");
            System.out.print("Fais ton choix (1, 2 ou 3) : ");

            choix = scanner.nextInt();
            System.out.println();

            switch (choix) {
                case 1:
                    System.out.println("\uD83D\uDD35 Tu choisis de continuer... Le jeu continue!");
                    break;
                case 2:
                    System.out.println("❌ Tu arrêtes ... t'en es sûr ?");
                    break;
                case 3:
                    System.out.println("❌ Quitter? Seulement si la majorité dit oui.");
                    break;
                default:
                    System.out.println("🚨 Option invalide ! Les gardes observent chaque mouvement...");
            }

            System.out.println("----------------------------------\n");

        } while (choix != 3);

        scanner.close();
    }

    public static void main(String[] args) {
        menusimple();
    }
}
