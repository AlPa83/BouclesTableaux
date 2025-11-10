public class Job19 {

    // Méthode qui inverse et affiche le tableau
    public static void inverse() {
        // Création d'un tableau de 7 nombres
        int[] tableau = {10, 20, 30, 40, 50, 60, 70};

        // On vérifie la taille du tableau
        if (tableau.length > 7) {
            System.out.println("Erreur : le tableau ne peut pas contenir plus de 7 nombres !");
            return; // On arrête la méthode
        }

        System.out.println("Tableau inversé :");

        // Parcours du tableau à l'envers
        for (int i = tableau.length - 1; i >= 0; i--) {
            System.out.print(tableau[i] + " ");
        }
    }

    // Méthode main après
    public static void main(String[] args) {
        inverse(); // Appel de la méthode inverse
    }
}
