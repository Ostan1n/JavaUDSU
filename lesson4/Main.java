import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.*;

/**
 * @author Alexander Ostanin
 * @version homework4
 */

public class Main {
    static Map<Integer, BigInteger> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Random random = new Random();
        // Создаём метод ThreadPoolExecutor , который исполняет асинохронный код в одном или нескольких потоках, nThreads - количество потоков.
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Task> l = new ArrayList<>();
        // Кол-во чисел, создаваемых в массиве
        for (int i = 0; i < 10; i++) {
            l.add(new Task(random.nextInt(10)));
        }
        // invokeAll() Метод возвращает список объектов Future после завершения всех задач или по истечении времени ожидания .
        List<Future<String>> m = executorService.invokeAll(l);
        for (Future f : m) {
            System.out.println(f.get());
        }
        // При использовании Executor мы можем отключить его, вызвав метод shutdown().
        executorService.shutdown();
    }

    static class Task implements Callable<String> {
        int n;

        public Task(int n) {
            this.n = n;
        }

        @Override
        public String call() {
            // Создаём объект типа: "BigInteger"
            BigInteger result = BigInteger.ONE;
            for (int i = n; i >= 2; i--) {
                //1. Перебираем и если в мапе есть элемент, ключ которого совпадает с элементом листа
                if (map.containsKey(i)) {
                    //2. Перемножаем значение этого элемента в мапе.
                    result = result.multiply(map.get(i));
                    break;
                }
                result = result.multiply(BigInteger.valueOf((long) i));
            }
            //3. Добавляем в мапу новый элемент с ключом "n" и значением "result".
            map.put(n, result);
            return "Число " + n + "," + " Его факториал: " + result;
        }
    }
}
