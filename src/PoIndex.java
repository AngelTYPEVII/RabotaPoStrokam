public class PoIndex {
    public static void main(String[] args) {
        String str = "Я человек";

        int indexM = str.indexOf("Я"); // Ищем символ в строке
        int indexJava = str.indexOf("человек"); // Ищем слово в строке

        if (indexM == -1) {
            System.out.println("Символ \"я\" не найден.");
        } else {
            System.out.println("Символ \"я\" найден, его индекс: " + indexM);
        }

        if (indexJava == -1) {
            System.out.println("Слово \"человек\" не найдено.");
        } else {
            System.out.println("Слово \"человек\" найдено, его индекс: " + indexJava);
        }
    }
}
