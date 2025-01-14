package dsa;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Find the middle element
            int mid = left + (right - left) / 2;

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid; // Target found, return index
            }
            // If the target is smaller than mid, narrow search to the left
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            // If the target is larger than mid, narrow search to the right
            else {
                left = mid + 1;
            }
        }

        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array (sorted in ascending order)
        int[] arr = {2, 3, 4, 10, 40, 55, 60, 99};

        // Target to search for
        int target = 2;

        // Perform binary search
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
