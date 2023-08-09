package code.challanges;

public class MergeSorting {
    void mergeNSort(int[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    void divide(int arr[], int left, int right)
    {
        if (left < right) {

            // Find the middle point
            int midPoint = left + (right - left) / 2;

            // Sort first and second halves
            divide(arr, left, midPoint);
            divide(arr, midPoint + 1, right);

            // Merge the sorted halves
            mergeNSort(arr, left, midPoint, right);
        }
    }

    static void printArray(int arr[])
    {
        for (int n:arr)
            System.out.print(n+ " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);

        MergeSorting ob = new MergeSorting();
        ob.divide(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}