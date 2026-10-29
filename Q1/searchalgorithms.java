
public class searchalgorithms {
    public static <T extends Comparable<T>> int linearSearch(T[] arr, T target) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x].compareTo(target) == 0) {
                return x;
        }
    }return -1;
}

    public static <T extends Comparable<T>> int binarySearch( T[] arr, T key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid].compareTo(key) > 0)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearchRecursive(T[] arr, T target) {
        return binarySearchRecursive(arr, target, 0, arr.length);
    }

public static <T extends Comparable<T>> int binarySearchRecursive(T[] arr, T target, int low, int high) {
    if (low > high) {
        return -1;
    }
    int mid = (low + high) / 2;
    if (arr[mid].compareTo(target) == 0) {
        return mid;
    } else if (arr[mid].compareTo(target) > 0) { // search right half (arr[mid] < target)
        return binarySearchRecursive(arr, target, mid + 1, high);
    } else { // search left half (arr[mid] > target)
       return binarySearchRecursive(arr, target, low, mid - 1);
    }
}
}