import java.util.Scanner;

/**
 * 2. Написать программу, которая создаст строку, в которой
 * находятся все целые числа, начиная с 1, выписаны в одну
 * строку «123456789101112131415...». Строка должна быть
 * длиной не более 1 000 символов.
 * По числу n (введенного с клавиатуры), выведите цифру на
 * n-й позиции (используется нумерация с 1).
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = sc.nextInt();
        int i = 1;
        StringBuilder sb = new StringBuilder();

        while (sb.length() + i < 1000) {
            sb.append(i);
            i++;
        }

        System.out.println(sb);
        System.out.printf("На %d позиции в строке находится цифра %s", n, sb.charAt(n - 1));
    }
}
