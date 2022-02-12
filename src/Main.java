import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int num = in.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int upNum = in.nextInt();
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < num; i++) {
            list.add(random.nextInt(upNum));
        }
        System.out.println("Вот случайный список: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        num = in.nextInt();
        Filter filter = new Filter(num);
        List<Integer> filterList = filter.filterOut(list);
        System.out.println("Выводим результат на экран:");
        for (int i = 0; i < filterList.size(); i++) {
            System.out.print(filterList.get(i) + " ");
        }
        System.out.println();
        logger.log("Завершаем программу");
    }
}
