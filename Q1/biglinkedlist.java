
public class biglinkedlist {
    public static void main(String[] args) {
        var list = new intlinkedlists();
        for(int x =0; x < 200; x++){
            list.addFront((int)(Math.random()*100 + 1));
            // to do: rest
        }
        var iter = list.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
