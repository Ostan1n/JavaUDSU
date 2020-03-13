import java.util.Comparator;

// сортировка по полу
class SortedBySex implements Comparator<Person> {
    public int compare(Person obj1, Person obj2) {
        String str1 = obj1.getSex();
        String str2 = obj2.getSex();

        return str1.compareTo(str2);
    }
}