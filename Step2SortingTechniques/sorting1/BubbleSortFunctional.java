/**
 * @author AbuhenaRony
 *
 * Bubble Sort Algorithm Functional
 */
package Step2SortingTechniques.sorting1;

public class BubbleSortFunctional {
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

        recursiveBubbleSort(arr, arr.length);

        System.out.print("After using recursive bubble sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            bubble(arr, i);
        }
    }

    public static void bubble(int[] arr, int i){
        for (int j = 0; j < i; j++) {

            if (arr[j]>arr[j+1]){
                swap(arr, j,j+1);
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void recursiveBubbleSort(int[] arr, int n){
        // base condition
        if (n==0) return;

        bubble(arr, n-1);

        recursiveBubbleSort(arr, n-1);
    }
}
