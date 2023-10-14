import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        print("apple");
        print("apple", "orange");
        print("apple", "orange", "pear");

        System.out.println(sumArguments(1, 2, 3));

        System.out.println(bungle("apple", "orange", "pear"));
        System.out.println(getWordOfLength(4, "apple", "orange", "pear"));

    }

    public static void print(String ...args){
        for (String a: args){
            System.out.println(a);
        }
    }

    public static int sumArguments(int ...args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static List<String> bungle(String ...args){
        return new ArrayList<>(Arrays.asList(args));
    }

    public static String getWordOfLength(int length, String ...words){
        for(String w:words){
            if (w.length() == length){
                return w;
            }
        }
        return null;
    }
    public static Optional<String> getOptionalOfWordOfLength(int length, String ...words){
        for(String w:words){
            if (w.length() == length){
                return Optional.of(w);
            }
        }
        return Optional.empty();
    }
    public static int[] getArr(int ...numbers){
        numbers[0] = 10;
        return numbers;
    }
}


