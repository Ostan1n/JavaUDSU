import java.util.Comparator;

// сортировка по возрасту
class SortedByAge implements Comparator<Person> {
    public int compare(Person obj1, Person obj2) {
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