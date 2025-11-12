public class Job24 {

    // Méthode qui compte pairs/impairs et affiche les résultats
    public static void pairsimpairs() {
        int[] nombres = new int[15]; // Création d'un tableau de 15 cases
        int pairs = 0;
        int impairs = 0;

        // On remplit le tableau avec des nombres aléatoires entre 0 et 99
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = (int)(Math.random() * 100); // nombre aléatoire entre 0 et 99
        }

        // On compte le nombre de pairs et d'impairs
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] % 2 == 0) {
                pairs++;
            } else {
                impairs++;
            }
        }

        // On affiche le tableau
        System.out.print("Tableau généré : ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }

        System.out.println("\nNombre de nombres pairs : " + pairs);
        System.out.println("Nombre de nombres impairs : " + impairs);
    }


    public static void main(String[] args) {
        pairsimpairs();
    }
}
