package homeWork36;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Homework {

    public static String minStringInList(List<String> list){
        String minString = Collections.min(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return minString;
    }

    public static String maxStringInList(List<String> list){
        String maxString = Collections.max(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return maxString;
    }

    public String findShortesrOrLongest(List<String> list){
        String minSize = list.get(0);
        int indexMin = 0;

        String maxSize = list.get(0);
        int indexMax = 0;


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minSize.length()){
                minSize = list.get(i);
                indexMin = i;
            } else if (list.get(i).length() > maxSize.length()) {
                maxSize = list.get(i);
                indexMax = i;
            }
        }
        if (indexMin < indexMax){
            return minSize;
        } else
            return maxSize;
    }
}
