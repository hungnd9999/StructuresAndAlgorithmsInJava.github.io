package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 8, 7, 9, 10, 12, 23, 18, 15, 16, 17, 14};
        SelectionSort(arr, 14);
        for (int i = 0; i < 14; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void SelectionSort(int A[], int A_size) {
        int j, indexMin, tmp;
        for (int i = 0; i < A_size - 1; i++) {
            indexMin = i;
            for (j = i + 1; j < A_size; j++) {
                if (A[j] < A[indexMin]) {
                    indexMin = j;
                }
            }
            // Swap(A[i], A[indexMin])
            tmp = A[i];
            A[i] = A[indexMin];
            A[indexMin] = tmp;
        }
    }
}
