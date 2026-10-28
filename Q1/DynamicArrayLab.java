
import java.util.ArrayList;

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
        System.out.println("Dynamic Array remove: " + (end-start)/1e6 + "ms" );


        System.out.println();
        System.out.println("-----Array Lists-----");
        var ArrayL = new ArrayList<Integer>();
        long start2 = System.nanoTime();
        for(int x = 0; x < 100_000; x++){
            ArrayL.add((int)Math.random() * 100_000);
        }
        long end2 = System.nanoTime();
        System.out.println("Array List Add: " + (end2-start2)/1e6 + "ms" );

        start2 = System.nanoTime();
        ArrayL.sort(null);
        end2 = System.nanoTime();
        System.out.println("Array List Sort: " + (end2-start2)/1e6 + "ms" );

         start2 = System.nanoTime();
        for(int x = 0; x < 100_000; x++){
            ArrayL.remove(0);

        }
        end2 = System.nanoTime();
        System.out.println("Array List Remove: " + (end2-start2)/1e6 + "ms" );

    }
}
