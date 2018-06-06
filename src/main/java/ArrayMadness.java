import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayMadness {
    public static void main(String args[]) {
        System.out.println("Enter 1st and 2nd Integer numbers:");
        Scanner input = new Scanner(System.in);
        int n1, n2;
        n1 = input.nextInt();
        n2 = input.nextInt();
        int res;
        res = n1 + n2;
        System.out.println(res);
    }

        public static void oddArrayMassive() {
            int[] oddArray = new int[10];
            int j = 0;
            System.out.println("Odd massive elements: ");
            for (int i = 0; j < 10; i++) {
                if ((i + 1) % 2 == 0) {
                    oddArray[j] = i;
                    j++;
                }
            }
            for (int element : oddArray) {
                System.out.print(element + ", ");
            }
        }

    public static void swapMinMaxElements() {
        int[] array = {3, -7, 0, 6, 9};
        System.out.println("Show initial massive:");
        showElements(array);
        int indexMin = 0;
        int indexMax = 0;
        int minimal = array[indexMin];
        int maximal = array[indexMax];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimal) {
                minimal = array[i];
                indexMin = i;
            }
            if (array[i] > maximal) {
                maximal = array[i];
                indexMax = i;
            }
        }
        System.out.println("Minimal massive element: " + minimal);
        System.out.println("Maximal massive element: " + maximal);
        swapElements(array, indexMin, indexMax);
        System.out.println("Show changed massive:");
        showElements(array);
    }

    public static void swapElements(int[] arr, int min, int max) {
        int tmp = arr[min];
        arr[min] = arr[max];
        arr[max] = tmp;
    }

    public static void showElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void massiveAverage() {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        showElements(array);
        int average = sum / array.length;
        System.out.println("Massive average is: \n" + average);
    }

    public static void rangeElementsMassive() {
        Random random = new Random();
        final int min = -1;
        final int max = 1;
        final int zero = 0;
        int minCount = 0;
        int maxCount = 0;
        int zeroCount = 0;
        int[] array = new int[13];
        // set massive elements
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(max + 1 - min) + min);
        }
        showElements(array);
        //count repetition of the massive elements
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case min:
                    minCount++;
                    break;
                case zero:
                    zeroCount++;
                    break;
                case max:
                    maxCount++;
                    break;
            }
        }
        //find most repetitive element of massive
        if ((minCount > maxCount) & (minCount > zeroCount)) {
            System.out.println("int" + min + " is highest repetitive element in massive, repeated " + minCount + " times");
        } else if ((minCount < maxCount) & (zeroCount < maxCount)) {
            System.out.println("int" + max + " is highest repetitive element in massive, repeated " + maxCount + " times");
        } else {
            System.out.println("int" + zero + " is highest repetitive element in massive, repeated " + zeroCount + " times");
        }
    }


}