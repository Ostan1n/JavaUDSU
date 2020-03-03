import java.util.Random; // импорт рандома
import java.util.Scanner; // импорт сканера

/**
 * @author Александр Останин.
 */

public class task2 {
    public static void main(String args[]) {
        Random random = new Random(); // Инициализируем генератор
        Scanner scanner = new Scanner(System.in); // Инициализируем сканер
        int n = scanner.nextInt(); // Считываем число
        for (int i = 0; i < n; i++) {
            int k = random.nextInt(100); // Получаем случайное число в диапазоне от min до max (включительно)
            // Обрабатываем исключения через try catch
            try {
                if (k < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                continue;
            }
            double q = Math.sqrt(k); // кв.корень
            if (((int) q) * ((int) q) == k) {
                System.out.println(k); // выводим ответ
            }
        }

    }
}


