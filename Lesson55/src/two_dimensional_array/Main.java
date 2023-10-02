package two_dimensional_array;


public class Main {
    public static void main(String[] args) {

        int[][] num = new int[3][6];

        num[0] = new int[]{3, 5, 7, 6, 3, 1};
        num[1] = new int[]{4, 6, 5, 3, 4, 5};
        num[2] = new int[]{2, 3, 4, 5, 6, 7};

        print(num);
        int[][] result = task(num);
        print(result);
    }

    private static void print(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] task(int[][] arr) {
        int[][] result = new int[arr.length + 1][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            result[result.length - 1][j] = sum;
        }
        return result;
    }
}







