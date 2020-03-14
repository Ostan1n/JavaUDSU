public class Person {
    private String name;
    private int age;
    private Sex sex;

    Person(String name, int age, Sex sex) {
        this.name = name; // Имя
        this.age = age; // Возраст
        this.sex = sex; // Пол
    }

    static int compare(Person p1, Person p2) {
        return p1.sex == Sex.MAN && p2.sex == Sex.WOMAN ? -1 : p1.sex == Sex.WOMAN && p2.sex == Sex.MAN ? 1 : p1.age > p2.age ? -1 : p1.age < p2.age ? 1 : p1.name.compareTo(p2.name);
    }

    @Override
    public String toString() {
        return "Owner: " + name + " Age: " + age + " Sex: " + sex;
    }
}
