package Q1;
public class pelican504{
    public static void main(String[] args) {
     int i[] = {-7,15,21,22,43,49,51,67,78,81,84,89,95,97};
     Integer iw[] = new Integer[i.length];
     for(int x = 0; x < 14; x++){
        iw[x] = i[x];
     }   
     System.out.println(searchalgorithms.binarySearch(iw,22));
     System.out.println(searchalgorithms.binarySearch(iw,89));
     System.out.println(searchalgorithms.binarySearch(iw,-100));
     System.out.println(searchalgorithms.binarySearch(iw,72));
     System.out.println(searchalgorithms.binarySearch(iw,102));
    }
}