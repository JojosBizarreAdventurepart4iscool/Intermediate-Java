public class testdoublelinkedlist {
    public static void main(String[] args) {
        var list = new doublelylinkedlists<Integer>();
        for(int x = 0; x <20; x++){
            list.add((int) (Math.random() * 100));
        }
        list.print();
        list.printReverse();
    }
}
