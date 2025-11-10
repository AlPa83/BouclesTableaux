public class Job15 {

    // Méthode qui trouve la valeur minimale dans un tableau et sa position
    public static void findMinimum() {
        // Définition directe des 8 entiers
        int[] numbers = {12, -3, 7, 0, -8, 4, 9, -1};

        // On vérifie la taille du tableau
        if (numbers.length > 8) {
            System.out.println("Erreur : le tableau ne peut pas contenir plus de 7 nombres !");
            return; // On arrête la méthode
        }

        // Initialisation du minimum et de sa position
        int minValue = numbers[0];
        int minIndex = 0;

        // Boucle classique pour trouver le minimum et son indice
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }

        // Affichage du tableau avec un for-each
        System.out.print("Table = [");
        int count = 0;
        for (int num : numbers) {
            System.out.print(num);
            count++;
            if (count < numbers.length) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("The minimum is " + minValue + " at position " + minIndex);
    }

    public static void main(String[] args) {
        findMinimum(); // Appel de la méthode
    }
}
