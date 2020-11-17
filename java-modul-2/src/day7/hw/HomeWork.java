package day7.hw;

public class HomeWork {
    public static void main(String[] args) {
        display(seriesUp(3));// → [1, 1, 2, 1, 2, 3]
        display(seriesUp(4));// → → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        display(seriesUp(2));// → [1, 1, 2]

        int[] arr1 = new int[]{1, 3, 1, 4};// → [1, 3, 4, 1]
        int[] arr2 = new int[]{1, 3, 1, 4, 4, 3, 1};// → [1, 3, 4, 1, 1, 3, 4]
        int[] arr3 = new int[]{3, 2, 2, 4};// → [3, 4, 2, 2]
        display(fix34(arr1));
        display(fix34(arr2));
        display(fix34(arr3));

    }

    public static int[] fix34(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                int index = arr[i];// число, стоящее на i - index. Not the index of i
                for (int j = index; j < arr.length; j++) {
                    if (arr[j] == 4) {
                        int temp = arr[i + 1];
                        arr[i + 1] = 4;
                        arr[j] = temp;
                    }
                }index++;
            }
        }
        return arr;
    }

    private static int[] seriesUp(int n) {
        int[] output = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                output[index] = j + 1;
                index++;
            }
        }
        return output;
    }

    public static void display(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
