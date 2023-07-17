package Step2SortingTechniques.sorting1;

import java.util.Arrays;

/**
 * @author AbuhenaRony
 * @Date 7/5/2023
 */


public class InsertionSortFunctional {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Before using insertion sort :: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("After using insertion sort :: " + Arrays.toString(arr));

        recursiveInsertionSort(arr, 0, arr.length);

        System.out.println("After using recursive insertion sort :: " + Arrays.toString(arr));

    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i);
        }
    }

    public static void insert(int[] arr, int i){
        int j=i;

        while(j>0 && arr[j-1]>arr[j]){

            swap(arr, j-1, j);

            j--;
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // recursive method
    public static void recursiveInsertionSort(int[] arr, int i, int n){

        // base condition
        if (i==n) return;

        insert(arr, i);

        recursiveInsertionSort(arr, i+1, n);
    }
}
