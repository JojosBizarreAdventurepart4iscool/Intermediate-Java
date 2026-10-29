public class testlinkedlist {
    public static void main(String[] args) {
        var list = new LinkedList<Character>();
        for(int x : new int[]{1, 2, 3, 4, 5})
            list.add((char)x);
        list.print();
        list.remove(2);
        list.print();
        list.remove(0);
        list.print();
        list.remove(1);
        list.print();
    }
}
// 1 2 3 4 5
//1 2 4 5
//2 4 5
//2 5