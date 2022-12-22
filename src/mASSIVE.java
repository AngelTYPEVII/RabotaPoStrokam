public class mASSIVE {

    public static void main(String[] args) {
        double[] cifra = {99, 2, 4, 5, 33, 127, 34, 899.1, 63, 155.3, -100};

        for (int i = 0; i < cifra.length; i++) {
            System.out.println(cifra[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < cifra.length; i++) {
            total += cifra[i];
        }
        System.out.println("Сумма чисел: " + total);

        double max = cifra[0];
        for (int i = 1; i < cifra.length; i++) {
            if (cifra[i] > max) max = cifra[i];
        }
        System.out.println("Наибольшее: " + max);

        double min = cifra[0] + 1;
        for (int i = 0; i < cifra.length; i++) {
            if (cifra[i] < min) min = cifra[i];
        }
        System.out.println("Наименьшее: " + min);
    }
}
