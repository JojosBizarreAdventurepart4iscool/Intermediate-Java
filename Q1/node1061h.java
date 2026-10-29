public class node1061h {
    public String str1 = "";
    public node1061h myNext;

    public node1061h(String s1){
        str1 = s1;
    }
    public String getStr(){
        return str1;
    }
    public void compare(String s1, String s2){
     String first = s1;
     String second = s2;
    if(first.compareTo(second) <=0 ){
        return;
    }
    if(first.compareTo(second) >0 ){
        String temp = first;
        first = second;
        second = temp;
    }
    }

}