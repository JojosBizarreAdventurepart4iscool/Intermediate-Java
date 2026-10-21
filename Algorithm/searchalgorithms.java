public class searchalgorithms {
    public static <T extends Comparable<T>> int linearSearch(T[] arr, T target) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x].compareTo(target) == 0) {
                return x;
            } else {
                return -1;
            }
        }
    }

    public static <T extends Comparable<T>> int binarySearch(T[] arr, T target) {
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == key)
                return mid;
            else if (array[mid] > key)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearchRecursive(T[] arr, T target) {
        return binarySearch(arr, target, 0, arr.length);
    }
}

public static <T extends Comparable<T>> int binarySearchRecursive(T[] arr, T target, int low, int high) {
    if (low > high) {
        return -1;
    }
    int mid = (low + high) / 2;
    if (arr[mid].compareTo(target) == 0) {
        return mid;
    } else if (arr[mid].compareTo(target) > 0) { // search right half (arr[mid] < target)
        binarySearchRecursive(arr, target, mid + 1, high);
    } else { // search left half (arr[mid] > target)
        binarySearchRecursive(arr, target, low, mid - 1);
    }
}