public class Job01 {

    // Méthode qui affiche tous les multiples de 3 jusqu'à 50
    static void multiplesde3() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Appel de la méthode
        multiplesde3();
    }
}
