package day1;

public class hw {
    public static void main(String[] args) {
        int index = 2;
        int valueInt = 6;
        double valueDouble = 3.2;
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        printArr(arr1);
        printArr(createArr(arr1));
        printArr(deleteArr(arr1, index));
        printArr(addArr(arr1, index, valueInt));
        printArr(updateArr(arr1, index, valueInt));
        double[] arr2 = new double[]{2.5, 6.8, 3.5, 7.5, 2.9};
        printArr(arr2);
        printArr(createArr(arr2));
        printArr(deleteArr(arr2, index));
        printArr(addArr(arr2, index, valueDouble));
        printArr(updateArr(arr2, index, valueDouble));
    }

    private static int[] updateArr(int[] arr, int index, int value) {
        arr[index] = value;
        return arr;
    }

    private static double[] updateArr(double[] arr, int index, double value) {
        arr[index] = value;
        return arr;
    }

    private static int[] addArr(int[] arr, int index, int value) {
        int[] output = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        output[index] = value;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = arr[i - 1];

        }
        return output;
    }

    private static double[] addArr(double[] arr, int index, double value) {
        double[] output = new double[arr.length + 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        output[index] = value;
        for (int i = index + 1; i < output.length; i++) {
            output[i] = arr[i - 1];

        }
        return output;
    }

    private static int[] deleteArr(int[] arr, int index) {
        int[] output = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = arr[i + 1];

        }
        return output;
    }

    private static double[] deleteArr(double[] arr, int index) {
        double[] output = new double[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = arr[i + 1];

        }
        return output;
    }

    private static void printArr(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void printArr(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] createArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (int) (Math.random() * 10);

        }
        return newArr;
    }

    private static double[] createArr(double[] arr) {
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = (Math.random() * 10);

        }
        return newArr;
    }
}
