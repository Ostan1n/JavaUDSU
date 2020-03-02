import java.util.Arrays;
import java.util.Comparator;

public class task3 implements Comparable<Person>{

    public static void main(String[] args) {

        // Массив людей
        Person[] abc = new Person[5];
        int before = (int) System.currentTimeMillis();

        abc[0] = new Person("Alex", "MAN", 29);
        abc[1] = new Person("Jesica", "WOMAN", 19);
        abc[2] = new Person("Make", "MAN", 3);
        abc[3] = new Person("PIZDA", "WOMAN", 21);
        abc[4] = new Person("Bob", "MAN", 6);

        // выведем данные без сортировки
        System.out.println("Без сортировки");
        for(Person person : abc)
            System.out.println(person.toString());
        int after = (int) System.currentTimeMillis();
        System.out.println("Время исполнения = " + (after - before) + " мс.");


        // Сортировка по Полу
        Arrays.sort(abc, new SortedBySex());
        System.out.println("\n~~~ Сортировка по полу");

        for(Person person : abc)
            System.out.println(person.toString());
            System.out.println("Время исполнения = " + (after - before) + " мс.");


        // Сортировка по Возрасту
        Arrays.sort(abc, new SortedByAge());
        System.out.println("\n~~~ Сортировка по Возрасту");

        for(Person product : abc)
            System.out.println(product.toString());
            System.out.println("Время исполнения = " + (after - before) + " мс.");

    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}


class Person{

    String name;	// имя
    String sex;     // пол
    int age;        // возраст
    Person(String name, String sex , int age)
    {
        this.name = name; //Чтобы разграничить поля и параметры, применяется ключевое слово this
        this.sex = sex;
        this.age = age;
    }

    // метод получения пола
    public String getSex() {
        return sex;
    }
    public void setName(String sex) {
        this.sex = sex;
    }

    // метод получения возраста
    public float getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    // преобразуем в строку и возвращаем её
    @Override
    public String toString()
    {
        return "Имя: " + String.valueOf (name) + ", Пол: " + String.valueOf (sex)
                + ", Возраст - "
                + String.valueOf (age);
    }
}


// сортировка по полу
class SortedBySex implements Comparator<Person>
{
    public int compare(Person obj1, Person obj2)
    {
        String str1 = obj1.getSex();
        String str2 = obj2.getSex();

        return str1.compareTo(str2);
    }
}

// всё, что нашёл в инете, Компоратор - это интерфейс,нужен для сравнивания.Compare - сравнивать, тот кто сравнивает — Comparator


// сортировка по возрасту
class SortedByAge implements Comparator<Person>
{
    public int compare(Person obj1, Person obj2)
    {
        float age1 = obj1.getAge();
        float age2 = obj2.getAge();

        if (age1 > age2) {
            return 1;
        } else if (age1 < age2) {
            return -1;
        } else {
            return 0;
        }
    }
}




