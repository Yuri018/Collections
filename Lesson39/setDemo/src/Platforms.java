import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Platforms {
    /*
    Написать метод, находящий минимальное количество платформ требуемых на ж/д станции,
    чтобы принять количество поездов по расписанию.
    Есть время прибытия и отправления поездов
    List arrival   [100, 140, 150, 200, 215, 400]
    List departure [110, 300, 220, 230, 315, 600]
    сначала сортируем листы
    List arrival   [100, 140, 150, 200, 215, 400]
    List departure [110, 220, 230, 300, 315, 600]

    time        arr/dep     platform
    100             arr         1
    110             dep         0
    140             arr         1
    150             arr         2
    200             arr         3
    215             arr         4
    220             dep         3
    230             dep         2
    300             dep         1
    315             dep         0
    400             arr         1
    600             dep         0
     */
    public static void main(String[] args) {
        List<Integer> arrival = Arrays.asList(100, 140, 150, 200, 215, 400);
        List<Integer> departure = Arrays.asList(110, 300, 220, 230, 315, 600);
        System.out.println("Min platforms required - " + findMinPlatformsNumber(arrival, departure));
    }

    public static int findMinPlatformsNumber(List<Integer> arrival, List<Integer> departure) {
        Collections.sort(arrival);
        Collections.sort(departure);

        int neededPlatforms = 0;
        int maxPlatform = 0;

        int i = 0;
        int j = 0;

        while (i < arrival.size() && j < departure.size()) {
            if (arrival.get(i) < departure.get(j)) {
                neededPlatforms++;
                i++;
                if (neededPlatforms > maxPlatform) {
                    maxPlatform = neededPlatforms;
                }
            } else {
                neededPlatforms--;
                j++;
            }
        }
        return maxPlatform;
    }
}
