public class Job13 {

    public static void doubleVal() {
        // On définit les 5 entiers
        int[] table1 = {2, 5, 8, 3, 10};

        // On vérifie la taille du tableau
        if (table1.length > 5) {
            System.out.println("Erreur : le tableau ne peut pas contenir plus de 5 nombres !");
            return; // On arrête la méthode
        }

        // Création du deuxième tableau où chaque élément est le double du premier
        int[] table2 = new int[table1.length];
        for (int i = 0; i < table1.length; i++) {
            table2[i] = table1[i] * 2;
        }

        // Affichage du premier tableau
        System.out.print("Table1 = [");
        for (int i = 0; i < table1.length; i++) {
            System.out.print(table1[i]);
            if (i < table1.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Affichage du second tableau
        System.out.print("Table2 = [");
        for (int i = 0; i < table2.length; i++) {
            System.out.print(table2[i]);
            if (i < table2.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        doubleVal(); // Appel de la méthode
    }
}
