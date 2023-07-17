/**
 * @author AbuhenaRony
 *
 * Bubble Sort Algorithm
 */
package Step2SortingTechniques.sorting1;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.print("Before using bubble sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();

        bubbleSort(arr);

        System.out.print("After using bubble sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 0; j <= i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
