public class Person {

    private String name;    // имя
    private String sex;     // пол
    private int age;        // возраст

    Person(String name, String sex, int age) {
        this.name = name; // Чтобы разграничить поля и параметры, применяется ключевое слово this
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
    public String toString() {
        return "Имя: " + String.valueOf(name) + ", Пол: " + String.valueOf(sex)
                + ", Возраст - "
                + String.valueOf(age);
    }
}