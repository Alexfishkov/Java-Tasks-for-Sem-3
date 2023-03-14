// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task_3_3 {

    public static void main(String args[]) {
        System.out.print("\033[H\033[J");
        System.out.println("Находим минимальное, максимальное и среднее арифметическое в заданном списке");
        List<Integer> numbers = new ArrayList<>();

        // Заполняем исходный список случайными числами
        for (int i = 0; i < 20; i++) {
            numbers.add(new Random().nextInt(-20, 20));
        }

        System.out.println("Исходный список выглядит так:");
        System.out.println(numbers);

        // находим нужные значения:
        int max = maximum(numbers);
        int min = minimum(numbers);
        double mean = arithMean(numbers);

        meaningsOutput(max, min, mean);
        
    }

    // Ищем максимальный элемент
    public static Integer maximum (List <Integer> ourList){
        int maxValue = ourList.get(0);
        for (int i = 1; i < 20; i++) {
            if (ourList.get(i) > maxValue) {
                maxValue = ourList.get(i);
            }
        }
        return maxValue;
    }
    
    // Ищем минимальный элемент
    public static Integer minimum (List <Integer> ourList){
        int minValue = ourList.get(0);
        for (int i = 1; i < 20; i++) {
            if (ourList.get(i) < minValue) {
                minValue = ourList.get(i);
            }
        }
        return minValue;
    }

    // Ищем среднее арифметическое
    public static Double arithMean (List <Integer> ourList){
        double sumValue = 0;
        double mean = 0;
        for (int i = 1; i < 20; i++) {
            sumValue +=ourList.get(i);
        }
        mean = sumValue/20;
        return mean;
    }

    // Вывод результатов в консоль и в файл
    public static void meaningsOutput (int max, int min, double arthMean){
        System.out.printf("Максимальное значение: %d \nМинимальное значение: %d \nСреднее арифметическое: %.2f", max, min, arthMean);
        try(FileWriter fw = new FileWriter("OutputFile.txt",false)) {
            fw.write("Результаты вычислений:\n");
            fw.write("Максимальное значение: ");
            fw.write(Integer.toString(max));
            fw.append('\n');
            fw.write("Минимальное значение: ");
            fw.write(Integer.toString(min));
            fw.append('\n');
            fw.write("Среднее арифметическое: ");
            fw.write(Double.toString(arthMean));
            fw.flush();
            fw.close();
        }
        catch (IOException ex){
            System.out.println("Ошибка при попытке записи в файл!");
        }
    }
}
