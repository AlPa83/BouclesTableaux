import java.util.Scanner;

public class Job20 {

    public static void search() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {5, 7, 15, 18, 22, 26, 31};

        System.out.println("Welcome! Enter a number to search for in the array.");
        System.out.println("Type 00 to exit.\n");

        while (true) {
            System.out.print("Enter the number you are searching for: ");
            int numberToFind = scanner.nextInt();

            // Condition de sortie
            if (numberToFind == 00) {
                System.out.println("Goodbye!");
                break;
            }

            int position = -1;

            // Recherche du nombre dans le tableau
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numberToFind) {
                    position = i;
                    break;
                }
            }

            // On vérifie si trouvé
            if (position >= 0) {
                System.out.println("The number " + numberToFind + " exists in the array at position " + position + ".");
            } else {
                System.out.println("Sorry, the number does not exist in the array.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        search();
    }
}
