public class Job22 {

    // Méthode qui crée, copie et affiche les tableaux
    public static void copy() {
        // On crée le premier tableau
        int[] tableau1 = {7, 18, 12, -9, 0};

        // On vérifie la taille du tableau
        if (tableau1.length > 5) {
            System.out.println("Erreur : le tableau ne peut pas contenir plus de 5 nombres !");
            return; // On arrête la méthode
        }

        // On crée le deuxième tableau de même taille
        int[] tableau2 = new int[tableau1.length];

        // On copie les éléments de tableau1 dans tableau2
        for (int i = 0; i < tableau1.length; i++) {
            tableau2[i] = tableau1[i];
        }

        // On affiche les deux tableaux
        System.out.print("Tableau 1 : ");
        for (int i = 0; i < tableau1.length; i++) {
            System.out.print(tableau1[i] + " ");
        }
        System.out.println();

        System.out.print("Tableau 2 : ");
        for (int i = 0; i < tableau2.length; i++) {
            System.out.print(tableau2[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        copy();
    }
}
