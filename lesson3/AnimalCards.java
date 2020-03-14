import java.util.*;

/**
 * @version lesson3
 * @autor Александ Останин
 */

public class AnimalCards {
    private static Set<Animal> set = new LinkedHashSet<>();
    /**
     * @param map это структура данных, в которой объекты хранятся не по одному, как во всех остальных, а в паре "ключ - значение"
     */
    private static Map<String, HashSet<Animal>> map = new HashMap<>();

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            persons.add(new Person("Pers" + i, i + 20, Sex.WOMAN));
        // Тут указываем кол-во людей и живо-х, которые появятся в отладке
        for (int i = 0; i < 15; i++) {
            Random random = new Random();
            int nameLength = random.nextInt() % 5 + 5;
            String name = (char) (random.nextInt(26) + 65) + "";
            StringBuilder stringBuilder = new StringBuilder(name);
            for (int j = 1; j < nameLength; j++) {
                stringBuilder.append((char) (random.nextInt(26) + 97));
            }
            /**
             * @param person.get получаем нужное кол-во хозяев и рандомный вес животного
             */
            Animal animal = new Animal(stringBuilder.toString(), persons.get(random.nextInt(5)), random.nextInt(10) + 10);
            add(animal);
            if (map.containsKey(name))
                map.get(name).add(animal);
            else {
                map.put(name, new HashSet<Animal>());
                map.get(name).add(animal);
            }
        }
        LinkedList<Animal> list = new LinkedList<Animal>(set);
        Collections.sort(list);
        for (Animal animal : list)
            System.out.println(animal);

    }

    public static void add(Animal animal) {

        if (!set.add(animal)) {
            System.out.println("Такое животное уже есть в списке");
        }

    }

    public HashSet<Animal> search(String name) {
        return map.get(name);
    }

    /**
     * Меняет имя, хозяина и вес по id в set
     *
     * @param id     идентификатор
     * @param name   имя
     * @param owner  хозяин
     * @param weight вес
     */
    public void change(int id, String name, Person owner, int weight) {
        for (Animal animal : set)
            if (animal.id == id) {
                animal.name = name;
                animal.owner = owner;
                animal.weight = weight;
            }

    }
}
