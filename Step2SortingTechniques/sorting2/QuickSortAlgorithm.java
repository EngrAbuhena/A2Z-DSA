package Step2SortingTechniques.sorting2;

import java.util.Arrays;

/**
 * @author AbuhenaRony
 * @Date 7/5/2023
 */
public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
        System.out.println("Before using quick sort :: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After using quick sort :: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        int j = low;
        while (j < high) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
            j++;
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
