import java.util.Scanner;

public class Job05 {

    // Méthode qui demande un damier N×N et l'affiche
    public static void damier(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print('#');
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        // Appel de la méthode
        damier(N);

        scanner.close();
    }
}
