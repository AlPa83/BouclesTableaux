public class Job26 {

    public static void studentNotes() {
        int[] notes = new int[10];
        int tresBien = 0, bien = 0, passable = 0, echec = 0;

        // On remplit le tableau avec des notes random entre 0 et 20
        for (int i = 0; i < notes.length; i++) {
            notes[i] = (int) (Math.random() * 21); // 0 à 20 inclus
        }

        // Comptage des notes
        for (int note : notes) {
            if (note >= 16) {
                tresBien++;
            } else if (note >= 12) {
                bien++;
            } else if (note >= 10) {
                passable++;
            } else {
                echec++;
            }
        }

        // On affiche et on compte les notes
        System.out.println("Notes des étudiants :");
        for (int note : notes) {
            System.out.print(note + " ");
        }
        System.out.println("\n");
        System.out.println("Très bien (>=16) : " + tresBien);
        System.out.println("Bien (>=12) : " + bien);
        System.out.println("Passable (>=10) : " + passable);
        System.out.println("Échec (<10) : " + echec);
    }

    public static void main(String[] args) {
        studentNotes();
    }
}
