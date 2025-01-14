package dsa;
public class SelectionSort {

    public static void main(String[] args) {
        int a[] = {8, 5, 9, 4, 2, 7};  // Time Complexity: O(n^2)

        // Implementing Selection Sort
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
