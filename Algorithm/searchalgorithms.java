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
        public class modFib {
            public static void main(String[] args) {

            }

            public static int modFibonacci(int in) {
                if (in == 1) {
                    return 3;
                } else if (in == 2) {
                    return 5;
                } else if (in == 3) {
                    return 8;
                } else {
                    return (modFibonacci(in - 1) + modFibonacci(in - 2) + modFibonacci(in - 3));
                }
            }
        }
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