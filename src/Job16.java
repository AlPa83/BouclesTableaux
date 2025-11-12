import java.util.Scanner;

public class Job16 {

    public static void ecartsimple() {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[5]; // tableau de 5 notes

        // Saisie des notes
        for (int i = 0; i < notes.length; i++) {
            while (true) {
                System.out.print("Entrez la note " + (i + 1) + " (0 à 20) : ");
                int note = sc.nextInt();
                if (note >= 0 && note <= 20) {
                    notes[i] = note;
                    break;
                } else {
                    System.out.println("Erreur : la note doit être comprise entre 0 et 20 !");
                }
            }
        }

        // Calcul de la somme des notes pour obtenir la moyenne
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        // Calcul de la moyenne
        double moyenne = (double) somme / notes.length;

        // Affichage de la moyenne
        System.out.println("Moyenne = " + moyenne);

        // Affichage de chaque note et de son écart par rapport à la moyenne
        for (int i = 0; i < notes.length; i++) {
            int ecart = notes[i] - (int) moyenne;
            String signe;
            if (ecart >= 0) {
                signe = "+";
            } else {
                signe = "";
            }

            System.out.println("Note " + (i + 1) + ": " + notes[i] + ", écart: " + signe + ecart);
        }
    }

    public static void main(String[] args) {
        ecartsimple();
    }
}
