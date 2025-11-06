public class Job01 {

    static void multiplesde3(int nombre) {
        System.out.print(nombre + " ");
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) { // si i est un multiple de 3
                multiplesde3(i);
            }
        }
    }
}
