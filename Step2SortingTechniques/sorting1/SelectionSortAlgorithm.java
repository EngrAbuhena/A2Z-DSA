/**
 * @author AbuhenaRony
 *
 * Selection Sort Algorithm
 */
package Step2SortingTechniques.sorting1;

public class SelectionSortAlgorithm {
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
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // find the min element from the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }

            // swap the selected element with min element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.print("After selection sort: ");
        for (int e : arr)
            System.out.print(e + " ");
    }
}
