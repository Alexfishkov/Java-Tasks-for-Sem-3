// Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_3_2 {
    public static void main(String args[]) {
        System.out.print("\033[H\033[J");
        System.out.println("Удаляем все чётные числа из произвольного списка целых чисел");
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        // Заполняем исходный список случайными числами
        for (int i = 0; i < 20; i++) {
            numbers.add(new Random().nextInt(0, 20));
        }
        System.out.println("Исходный список выглядит так:");
        System.out.println(numbers);

        // Если число нечётное, то добавляем его в новый ArrayList - result
        for (int i = 0; i < 20; i++) {
            if (numbers.get(i) % 2 != 0) {
                result.add(numbers.get(i));
            }
        }
        // Вывод результата:
        System.out.println("Удалили все чётные числа:");
        System.out.println(result);
    }
}
