import java.util.Scanner;

public class Job12 {

    public static void password() {
        Scanner scanner = new Scanner(System.in);
        String motDePasse = "Azerty123+";
        String str;

        do {
            System.out.print("Entrez le mot de passe : ");
            str = scanner.nextLine();

            if (!motDePasse.equals(str)) {
                System.out.println("Error! Try again!");
            }

        } while (!motDePasse.equals(str)); // répète tant que ce n'est pas le bon

        System.out.println("Mot de passe correct !");
        scanner.close();
    }

    public static void main(String[] args) {
        password();
    }
}
