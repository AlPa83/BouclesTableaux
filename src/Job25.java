import java.util.Scanner;

public class Job25 {

    public static void weektemp() {
        Scanner scanner = new Scanner(System.in);

        String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        double[] temp = new double[7];

        // Saisie des températures
        System.out.println("\n=== Entrez les températures de la semaine ===");
        for (int i = 0; i < jours.length; i++) {
            System.out.print(jours[i] + " : ");
            temp[i] = scanner.nextDouble();
        }

        // --- Calculs ---
        double somme = 0;
        double max = temp[0];
        double min = temp[0];

        for (int i = 0; i < temp.length; i++) {
            somme += temp[i];
            if (temp[i] > max) {
                max = temp[i];
            }
            if (temp[i] < min) {
                min = temp[i];
            }
        }

        double moyenne = somme / temp.length;

        // On trouve tous les jours avec la température max et min
        String joursMax = "";
        String joursMin = "";

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == max) {
                joursMax += jours[i] + " "; // pour afficher l'espace entre les deux jours
            }
            if (temp[i] == min) {
                joursMin += jours[i] + " "; // idem
            }
        }

        // Affichage des résultats
        System.out.println("\n=== Résultats ===");
        System.out.println("Température moyenne : " + moyenne + "°C");
        System.out.println("Jour(s) le(s) plus chaud(s) : " + joursMax.trim() + " avec " + max + "°C"); // trim() supprime tous les espaces blancs au début et à la fin de string.
        System.out.println("Jour(s) le(s) plus froid(s) : " + joursMin.trim() + " avec " + min + "°C");

        scanner.close();
    }

    public static void main(String[] args) {
        weektemp();
    }
}


