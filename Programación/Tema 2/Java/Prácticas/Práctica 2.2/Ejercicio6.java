public class Ejercicio6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3000; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 3000; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }

        int i = 1;
        while (i <= 3000) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}