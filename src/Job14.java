public class Job14 {

    // Méthode qui calcule le produit de tous les éléments d'un tableau
    public static void prodElements() {
        // Création d'un tableau de 5 entiers (valeurs entre 0 et 10)
        int[] tableau = {7, 1, 5, 8, 3};

        // On vérifie la taille du tableau
        if (tableau.length > 5) {
            System.out.println("Erreur : le tableau ne peut pas contenir plus de 5 entiers !");
            return; // On arrête la méthode
        }

        // Variable pour stocker le produit, initialisée à 1 (neutre pour la multiplication)
        int produit = 1;

        // Parcours du tableau pour multiplier tous les éléments (for-each)
        for (int valeur : tableau) {
            produit *= valeur;
        }

        // Affichage du tableau avec for-each
        System.out.print("Tableau = [");
        int count = 0;
        for (int valeur : tableau) {
            System.out.print(valeur);
            count++;
            if (count < tableau.length) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Le produit des éléments du tableau est : " + produit);
    }

    public static void main(String[] args) {
        prodElements(); // Appel de la méthode
    }
}
