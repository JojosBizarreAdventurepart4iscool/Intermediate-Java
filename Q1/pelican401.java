package Q1;

public class pelican401 {
    public static void main(String[] args) {
        int[] theArray = {4,2,5,1,3,18,0,9,6};
        var something = new Integer[theArray.length];
        for(int x = 0; x < theArray.length; x++){
            something[x] = theArray[x];
        }
        sortingalgorithms.bubbleSort(something);
        for(int x = 0; x < theArray.length; x++){
            System.out.println(something[x] + " ");
        } 
        int[] theArray2 = {4,2,5,1,3,18,0,9,6};
        System.out.println();
        sortingalgorithms.insertionSort(something);
                for(int x = 0; x < theArray2.length; x++){
            System.out.println(something[x] + " ");
        }
        int[] theArray3 = {4,2,5,1,3,18,0,9,6};
        System.out.println();
        sortingalgorithms.selectionSort(something);
                for(int x = 0; x < theArray3.length; x++){
            System.out.println(something[x] + " ");
        }
        System.out.println();
    }

    

}
