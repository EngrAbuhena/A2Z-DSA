/**
 * @author AbuhenaRony
 *
 * Selection Sort Algorithm Functional
 */
package Step2SortingTechniques.sorting1;

public class SelectionSortFunctional {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.print("Before using selection sort :: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.print("After using selection sort :: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            select(arr, i);
        }
    }

    public static void select(int[] arr, int i) {
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {

            if (arr[j] < arr[min]) {
                swap(arr, j, min);
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
