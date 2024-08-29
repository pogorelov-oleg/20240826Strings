import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 4. Ввести строку с клавиатуры (латиницей). Из введенной
 * строки выбрать все слова, начинающиеся на гласные буквы
 * и заканчивающиеся на согласные. Вывести отобранные
 * слова на консоль.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст латиницей: ");
        String userInput = sc.nextLine();
        Pattern p = Pattern.compile("^[AaEeIiOoUuYy][a-z]+[^AaEeIiOoUuYy]$");
        Matcher m;

        String[] temp = userInput.split("[^A-Za-z]+");
        for (String word : temp) {
            m = p.matcher(word);
            if (m.matches()) System.out.print(word + " ");
        }
    }
}
