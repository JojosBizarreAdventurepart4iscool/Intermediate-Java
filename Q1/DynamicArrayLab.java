package Q1;

public class DynamicArrayLab {
    public static void main(String[] args) {
        System.out.println("-----Dynamic Array -----");
        var dArray = new dynamicarray<Integer>();
        long start = System.nanoTime();
        for( int x = 0; x < 100_000; x++){
            dArray.add((int)Math.random() * 100_000);
        }
        Long end = System.nanoTime();
        System.out.println("Dynamic Array Add: " + (end-start)/1e6 + "ms" );

        start = System.nanoTime();
        dArray.sort();
        end = System.nanoTime();
        System.out.println("Dynamic Array Sort: " + (end-start)/1e6 + "ms" );


        start = System.nanoTime();
        for(int x = 0; x < 100_000; x++){
            dArray.remove(0);

        }
        end = System.nanoTime();
        System.out.println("Dynamic Array Sort: " + (end-start)/1e6 + "ms" );

        //TODO: ArrayLists 20 minute mark on lecture 10
        //sort with ":arraylist.sort(null);"
    }
}
