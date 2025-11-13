public class Job28 {

    // Méthode qui filtre les nombres
    public static void filter() {
        int[] numbers = new int[12];

        // On crée le tableau aléatoire
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100); // nombres entre 0 et 99
        }

        // Affichage du tableau original
        System.out.println("Tableau original :");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // On compte les nombres pairs
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }

        // On crée et remplit le tableau des nombres pairs
        int[] evens = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
        }

        // On affiche le tableau des nombres pairs
        System.out.println("Tableau des nombres pairs :");
        for (int num : evens) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        filter(); // Appel de la méthode
    }
}
