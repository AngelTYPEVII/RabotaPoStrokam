public class PoElementu2 {

    public static void main(String args[]) {
        String gm = "Доброе утро";

        int index1 = gm.indexOf("брое");
        int index2 = gm.indexOf("ыыыыы");
        int index3 = gm.indexOf("Доброе утро", -2);
        int index4 = gm.indexOf("Доброе утро", 2);
        int index5 = gm.indexOf("Доброе утро", 888);
        int index6 = gm.indexOf("тро", 1);
        System.out.println("Мы ищем 'брое' в строке " + gm + ". Индекс " + index1);
        System.out.println("Мы ищем 'ыыыыы' в строке " + gm + ". Индекс " + index2);
        System.out.println("Мы ищем 'Доброе утро' в строке " + gm + " начиная с индекса -2. Результат: " + index3);
        System.out.println("Мы ищем 'Доброе утро' в строке " + gm + " начиная с индекса 2. Результат: " + index4);
        System.out.println("Мы ищем 'Доброе утро' в строке " + gm + " начиная с индекса 888. Результат: " + index5);
        System.out.println("Мы ищем 'тро' в строке " + gm + ". Индекс " + index1);
    }
}
