package Sort;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 7, 9, 10, 12, 23, 18, 15, 16, 17, 14};
        InsertionSort(arr, 14);
        for (int i = 0; i < 14; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void InsertionSort(int A[], int array_size) {
        int j, temp;
        for (int i = 0; i < A.length; i++) {
            temp = A[i];
            j = i;
            while ((j > 0) && (A[j - 1] > temp)) {
                A[j] = A[j - 1];
                j = j - 1;
            }
            A[j] = temp;
        }
    }
}

