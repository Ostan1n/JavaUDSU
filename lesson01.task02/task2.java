public class task2 {

    /**
     * Main method
     * @param args
     */

    public static void main(String[] args) {

    /**
     * @param array[i] Генерирует случайно число на промежутке [-15,15]
     * @param q Вычисляет квадратный корень целой части числа из массива array
     */

    int[] array;
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
        array[i] = (int) Math.round((Math.random() * 30) - 15);
        double q = (int) (Math.sqrt(array[i]));
        System.out.println("Число: " + array[i]);
        if (array[i] < 0) {
            System.out.println("Из этого числа корень не извлечь: " + array[i] + " " + "оно отрицательное");
        } else if (q * q == array[i]) {
            System.out.println("Ответ: " + array[i]);
            System.out.println("Квадратный корень " + q);
        }
    }
    }
}

