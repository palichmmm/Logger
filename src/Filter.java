import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        List<Integer> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < source.size(); i++) {
            int value = source.get(i);
            sb.append("Элемент \"").append(value);
            if (value > treshold) {
                result.add(value);
                sum++;
                sb.append("\" проходит");
            } else {
                sb.append("\" не проходит");
            }
            logger.log(sb.toString());
            sb.delete(0,sb.length());
        }
        logger.log("Прошло фильтр " + sum + " элементов из " + source.size());
        return result;
    }
}
