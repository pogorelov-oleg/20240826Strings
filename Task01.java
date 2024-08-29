import java.util.Scanner;

/**
 * 1. Ввести с клавиатуры строку текста, а затем один символ.
 * Показать на консоль индексы и количество совпадений (ищем
 * вхождения символа в строку). В случае если совпадений не
 * найдено, вывести соответствующий текст.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку текста: ");
        String userInput = sc.nextLine();
        System.out.print("Введите символ: ");
        String toSearch = sc.nextLine();
        int count = 0;
        int nextIndex = userInput.indexOf(toSearch);

        System.out.print("Индексы, содержащие символ \"" + toSearch + "\": ");
        while (nextIndex != -1) {
            count++;
            System.out.print(" " + nextIndex);
            nextIndex = userInput.indexOf(toSearch, nextIndex + 1);
        }
        System.out.printf("\nЧисло вхождений символа \"%s\": %d", toSearch, count);
    }
}
