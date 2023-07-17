/**
 * @author AbuhenaRony
 *
 * Merge Sort Algorithm
 */
package Step2SortingTechniques.sorting2;

import java.util.ArrayList;
import java.util.List;

public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("Before using merge sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("After using merge sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void mergeSort(int[] arr, int low, int high) {
        // base condition
        if (low >= high) return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid); // left half

        mergeSort(arr, mid + 1, high); // right half

        merge(arr, low, mid, high); // merging the sorted array
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        // temporary array
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left portion still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right portion still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary array to array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
