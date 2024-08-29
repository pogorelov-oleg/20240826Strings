import java.util.Scanner;

/**
 * 5. Ввести строку с клавиатуры.В строке должны содержаться
 * слова, которые могут быть раздельные пробелами или
 * двоеточиями. Необходимо вычислить количество слов в
 * строке, у которых четное количество букв.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите набор слов через пробел или двоеточие: ");
        String userInput = sc.nextLine();
        int count = 0;

        String[] temp = userInput.split("[:\\s]+");
        for (String word : temp) {
            if (word.length() % 2 == 0) count++;
        }

        System.out.println("Количество слов с четным количеством букв: " + count);
    }
}
