public class biglinkedlist {
    public static void main(String[] args) {
        var list = new intlinkedlists();
        for (int x = 0; x < 200; x++) {
            list.addFront((int) (Math.random() * 100 + 1));
            // to do: rest
        }
        list.print();
        list.addLast(10);
        list.print();
        System.out.println(list.getCount());
        System.out.println(list.isEmpty());
        System.out.println(list.isThere(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getSpot(1));
        System.out.println(list.countless10());
        System.out.println(list.avg());
        System.out.println(list.min());
        System.out.println(list.max());
        System.out.println(list.checkforNum(100));

    }
}
