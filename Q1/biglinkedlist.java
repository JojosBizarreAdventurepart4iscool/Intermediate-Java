public class biglinkedlist {
    public static void main(String[] args) {
        var list = new intlinkedlists();
        for (int x = 0; x < 201; x++) {
            list.addFront((int) (Math.random() * 100 + 1));
            // to do: rest
        }
        list.print();
        var rlist = list.getReverse();
        rlist.print();
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
        System.out.println(list.getNum(3));
        System.out.println(list.firstMax());
        System.out.println(list.lastMax());
        System.out.println(list.getEvenCount());
        System.out.println(list.add(0, 1));
        list.addLast(150);
        list.removeFirst();
        list.removeLast();
        list.removeSpot(3);
        list.iterator();
        System.out.println();
        list.killOdds();
        list.print();
    }
}
