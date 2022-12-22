public class PoElementu {

    public static void main(String args[]) {
        String hello = "Hello";

        int index1 = hello.indexOf('H', 2);
        int index2 = hello.indexOf('o', 2);
        int index3 = hello.indexOf('W', 2);
        System.out.println("Ищем букву 'H' в строке " + hello + " начиная с индекса номер 2. Индекс " + index1);
        System.out.println("Ищем букву 'o' в строке " + hello + " начиная с индекса 2. Индекс " + index2);
        System.out.println("Ищем букву 'W' в строке " + hello + " начиная с индекса 2. Индекс " + index3);
    }
}
