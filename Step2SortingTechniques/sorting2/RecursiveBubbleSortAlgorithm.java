/**
 * @author AbuhenaRony
 */
package Step2SortingTechniques.sorting2;

public class RecursiveBubbleSortAlgorithm {
    public static void main(String[] args) {
        int n=10;
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("Before using bubble sort :: ");
        for (int e:arr)
            System.out.print(e+" ");
        System.out.println();

        recursiveBubbleSort(arr, n);

        System.out.print("After using bubble sort :: ");
        for (int e:arr)
            System.out.print(e+" ");
        System.out.println();
    }

    public static void recursiveBubbleSort(int[] arr, int n)
    {
        if (n==0) return;

        for (int i = 0; i < n-1; i++) {

            if (arr[i]>arr[i+1])
            {
                // swap
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        recursiveBubbleSort(arr,n-1);
    }
}
