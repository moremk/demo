package dsa;

public class Insertionsort {
    
    // Insertion Sort Algorithm (Iterative version)
    public static void insertsort(int[] a) {
        // Loop over the array starting from the second element
        for (int i = 1; i < a.length; i++) {
            int key = a[i];  // Element to be inserted in the sorted portion
            int j = i - 1;   // Pointer to the last element of the sorted portion

            // Move elements of a[0..i-1] that are greater than key
            // one position ahead of their current position
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            // Insert the key in the correct position
            a[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] a = {5, 3, 6, 2, 7, 8};  

        // Perform insertion sort
        insertsort(a);
        
        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
