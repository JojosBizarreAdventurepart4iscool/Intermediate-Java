public class CircularLinkLab {
    public static void main(String[] args) {
        var list = new circularlinkedlist<Integer>();
        System.out.println(list.size());
        list.add(5);
        list.add(7);
        list.add(13);
        System.out.println(list.size());

        list.print();
        list.remove(1);
        list.print();

        try{

        }catch (IndexOutOfBoundsException e){
            System.err.println("No such Index");
        }
        for(var x : list){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}
