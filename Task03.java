import java.util.Scanner;

/**
 * 3. Подсчитать среднюю длину слова, во введенном с
 * клавиатуры предложении.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String userInput = sc.nextLine();
        int sum = 0;
        double avarage;

        String[] temp = userInput.split("[^A-Za-zА-Яа-я]+");
        for (String word : temp) {
            sum += word.length();
        }
        avarage = (double) sum / temp.length;

        System.out.printf("Средняя длина слов в тексте: %.2f", avarage);
    }
}
