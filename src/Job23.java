public class Job23 {

    // Méthode qui calcule et renvoie un tableau contenant les carrés de 1 à 10
    public static int[] squareArray() {
        int[] squares = new int[10];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = (i + 1) * (i + 1);
        }

        return squares;
    }

    public static void main(String[] args) {
        // Appel de la méthode
        int[] result = squareArray();

        // On affiche le tableau
        System.out.print("Tableau des carrés : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
