package Sort;

public class BubleSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 7, 9, 10, 12, 23, 18, 15, 16, 17, 14};
        bubbleSort(arr, 14);
        for (int i = 0; i < 14; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int A[], int arr_zie) {
        int temp;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    static void BubbleSort(int array[], int array_size) {
        int i, j;
        for (i = array_size - 1; i > 0; i--) {
            for (j = 1; j <= i; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
