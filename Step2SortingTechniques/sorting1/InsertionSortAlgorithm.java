/**
 * @author AbuhenaRony
 *
 * Insertion Sort Algorithm
 */
package Step2SortingTechniques.sorting1;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("Before using insertion sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();

        insertionSort(arr);

        System.out.print("After using insertion sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
