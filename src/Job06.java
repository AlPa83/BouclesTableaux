import java.util.Scanner;

public class Job06 {

    public static void devinette(Scanner scanner) {
        int nMystere = (int) (Math.random() * 100) + 1; // nombre entre 1 et 100

        System.out.println("Devinez le nombre entre 1 et 100 !");

        while (true) {
            System.out.print("Devinez le nombre : ");
            int input = scanner.nextInt();

            if (input < nMystere) {
                System.out.println("Trop petit !");
            } else if (input > nMystere) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo ! Félicitations !");
                break;  // sortie de la boucle
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        devinette(scanner);
        scanner.close();
    }
}
