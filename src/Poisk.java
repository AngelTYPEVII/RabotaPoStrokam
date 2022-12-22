public class Poisk {
    public static void main(String[] args) {
        String str = "Хочу съесть шаурму";
        System.out.println("Слово \"шаурму\" есть в строке? Ответ: " + str.contains("шаурму"));
        System.out.println("Символ \"1\" присутствует в строке? Ответ: " + str.contains("1"));
    }
}
