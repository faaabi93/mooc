import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int value: array) {
            if(value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallests = 0;
        int i = 0;
        for(int value: array) {
            if(value < array[indexOfSmallests]) {
                indexOfSmallests = i;
            }
            i++;
        }
        return indexOfSmallests;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;
        int i = startIndex;
        while(i < array.length) {
            if(array[indexOfSmallest] > array[i]) {
                indexOfSmallest = i;
            }
            i++;
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        int i = 0;
        while(i < array.length) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
            i++;
        }
    }

}
