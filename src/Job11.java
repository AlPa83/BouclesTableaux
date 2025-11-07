import java.util.Scanner;

public class Job11 {

    // Méthode qui convertit les temperatures
    public static void tempCalc() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        double temperature;

        do {
            // Affichage du menu
            System.out.println("\nMenu:");
            System.out.println("1. Celsius vers Fahrenheit");
            System.out.println("2. Fahrenheit vers Celsius");
            System.out.println("3. Quitter");
            System.out.print("Entrez votre choix: ");
            choix = scanner.nextInt();

            if (choix == 1) {
                System.out.print("Entrez la température en Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println(temperature + "°C = " + fahrenheit + "°F");
            } else if (choix == 2) {
                System.out.print("Entrez la température en Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println(temperature + "°F = " + celsius + "°C");
            } else if (choix == 3) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Choix invalide, veuillez réessayer.");
            }

        } while (choix != 3);

        scanner.close();
    }

    public static void main(String[] args) {
        // Appel de la méthode
        tempCalc();
    }
}
