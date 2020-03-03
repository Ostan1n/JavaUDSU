import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Александр
 */


public class task3 implements Comparable<Person> {

    public static void main(String[] args) {

        // Массив людей
        Person[] abc = new Person[5];
        int before = (int) System.currentTimeMillis(); // Начальное время запуска

        abc[0] = new Person("Alex", "MAN", 29);
        abc[1] = new Person("Jesica", "WOMAN", 19);
        abc[2] = new Person("Make", "MAN", 3);
        abc[3] = new Person("PIZDA", "WOMAN", 21);
        abc[4] = new Person("Bob", "MAN", 6);

        // выведем данные без сортировки
        System.out.println("Без сортировки");
        for (Person person : abc)
            System.out.println(person.toString());
        int after = (int) System.currentTimeMillis();

        // Сортировка по Полу
        Arrays.sort(abc, new SortedBySex());
        System.out.println("\n~~~ Сортировка по полу");

        for (Person person : abc)
            System.out.println(person.toString());
        System.out.println("Время исполнения = " + (after - before) + " мс.");


        // Сортировка по Возрасту
        Arrays.sort(abc, new SortedByAge());
        System.out.println("\n~~~ Сортировка по Возрасту");

        for (Person product : abc)
            System.out.println(product.toString());
        System.out.println("Время исполнения = " + (after - before) + " мс.");

    }

    // Переопределение метода
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}






