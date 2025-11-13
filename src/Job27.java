public class Job27 {

    public static void identicalOrNot() {
        int[] tableau1 = new int[6];
        int[] tableau2 = new int[6];

        // On remplit les tableaux d'une façon aléatoire
        for (int i = 0; i < 6; i++) {
            tableau1[i] = (int) (Math.random() * 10); // nombres entre 0 et 9
            tableau2[i] = (int) (Math.random() * 10);
        }

        // On affiche les tableaux
        System.out.print("Tableau 1 : ");
        for (int i = 0; i < tableau1.length; i++) {
            System.out.print(tableau1[i] + " ");
        }
        System.out.println();

        System.out.print("Tableau 2 : ");
        for (int i = 0; i < tableau2.length; i++) {
            System.out.print(tableau2[i] + " ");
        }
        System.out.println();

        // On compare les tableaux avec une boucle for each
        boolean identiques = true;
        int index = 0; // pour suivre la position dans tableau2
        for (int valeur : tableau1) {
            if (valeur != tableau2[index]) {
                identiques = false;
                break; // on sort dès qu'une différence est trouvée
            }
            index++; // on passe à l'élément suivant de tableau2
        }

        // Résultat
        if (identiques) {
            System.out.println("Les tableaux sont identiques");
        } else {
            System.out.println("Les tableaux sont différents");
        }
    }

    public static void main(String[] args) {
        identicalOrNot();
    }
}
