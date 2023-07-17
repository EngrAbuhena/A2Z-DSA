package Step2SortingTechniques.sorting2;

public class RecursiveInsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("Before using insertion sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();

        insertionSort(arr,0,arr.length);

        System.out.print("After using insertion sort :: ");
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void insertionSort(int[] arr, int i, int n)
    {
        // base condition
        if (i==n) return;

        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }

        insertionSort(arr,i+1, n);
    }
}
