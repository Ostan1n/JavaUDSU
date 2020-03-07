import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Метод для работы с объектами
 */
public class ObjectBox {
    public Set<Object> set = new LinkedHashSet<>();

    /**
     *
     * @param o - Метод для добавление объекта
     */
    public void addObject(Object o)
    {
        set.add(o);
    }

    /**
     *
     * @param o - Метод для удаление объекта
     */
    public void deleteObject(Object o)
    {
        set.remove(o);
    }

    /**
     *
     * @return возвращаем строку из объектов
     */
    public String dump()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object number: set)
        {
            stringBuilder.append(number.toString());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
