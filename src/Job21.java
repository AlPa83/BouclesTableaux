import java.util.Scanner;

public class Job21 {

    // Méthode qui demande un nombre et compte les occurrences
    public static void countOc() {
        Scanner sc = new Scanner(System.in);

        int[] nombres = {2, 2, 0, 4, 3, 1, 0, 8, 1, 5, 0, 9, 6, 1, 1};

        while (true) {
            // On demande le nombre à rechercher
            System.out.print("Enter a number to search (00 to stop): ");
            int numbertoFind = sc.nextInt();

            // Condition de sortie
            if (numbertoFind == 00) {
                break;
            }

            // On compte le nombre d'occurrences du nombre recherché
            int compteur = 0;
            for (int n : nombres) {
                if (n == numbertoFind) {
                    compteur++;
                }
            }

            // On affiche le résultat
            if (compteur > 0) {
                System.out.println("Number " + numbertoFind + " appears " + compteur + " times in the array.");
            } else {
                System.out.println("Number " + numbertoFind + " does not exist in the array.");
            }
        }

        // Après la boucle, on demande si l'utilisateur veut connaître le nombre le plus fréquent
        System.out.print("Do you want to know which number appears the most in the array? (01 = yes / 02 = no): ");
        String reponse = sc.next();

        if (reponse.equals("01")) {
            mostFrequent(nombres);
        }

        System.out.println("Program terminated.");
        sc.close();
    }

    // Méthode qui affiche le nombre qui apparaît le plus
    public static void mostFrequent(int[] nombres) {
        int maxCount = 0;
        int nombreFrequent = nombres[0];

        for (int i = 0; i < nombres.length; i++) {
            int count = 0;
            for (int j = 0; j < nombres.length; j++) {
                if (nombres[i] == nombres[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                nombreFrequent = nombres[i];
            }
        }

        System.out.println("The number that appears the most is " + nombreFrequent + " with " + maxCount + " occurrences.");
    }

    public static void main(String[] args) {
        countOc();
    }
}
