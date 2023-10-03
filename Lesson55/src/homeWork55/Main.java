package homeWork55;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    Создать двумерный массив 5x3 т.е. 5 строк 3 столбца. Заполнить его случайными числпми.
Написать метод, который преобразует его в одномерный массив из 15 элементов, перенося числа по-порядку
(слева направо и сверху вниз) из исходного
Написать метод, который меняет все значения из первой строки, на соответствующие значения из 3 строки,
а значения из третьей строки на значения из первой. Т.е. в итоге нужно поменять местами первую и третью строки исходного массива.
     */

    public static void main(String[] args) {
        int[][] array = new int[5][3];
        int[][] arrayRandomNum = fillArray(array);
        print(arrayRandomNum);
        int[] oneDimensionArray = convertToOneDimensionalArray(arrayRandomNum);
        System.out.println(Arrays.toString(oneDimensionArray));
        int[][] newArray = changeStringValues(arrayRandomNum, 1, 3);
        print(newArray);
    }

    private static int[][] fillArray(int[][] arr) {
        int[][] array = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                array[i][j] = (int) (Math.random() * (200 + 1)) - 100;
            }
        }
        return array;
    }

    private static int[] convertToOneDimensionalArray(int[][] arr) {
        int[] oneDimensionArray = new int[arr.length * arr[0].length];

        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp.add(arr[i][j]);
            }
        }
        for (int i = 0; i < oneDimensionArray.length; i++) {
            oneDimensionArray[i] = temp.get(i);
        }
        return oneDimensionArray;
    }

    public static int[][] changeStringValues(int[][] arr, int str1, int str2) {

        if (str1 > arr[str1].length || str2 > arr[str2].length) {
            return arr;
        }
        int[] temp = arr[str1 - 1];
        arr[str1 - 1] = arr[str2 - 1];
        arr[str2 - 1] = temp;
        return arr;
    }

    private static void print(int[][] num) {
        for (int[] ints : num) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
    }
}
