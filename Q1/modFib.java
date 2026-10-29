
public class modFib {
    public static void main(String[] args) {

    }
    public static int modFibonacci(int n) {
        if (n == 1) {
            return 3;
        }else if (n ==2){
            return 5;
        }
        else if(n ==3){
            return 8;
        }
        else{
            return (modFibonacci(n-1) + modFibonacci(n-2) + modFibonacci(n-3));
        }
    }
}
