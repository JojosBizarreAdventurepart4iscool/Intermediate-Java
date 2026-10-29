public class nodehelper1061h {
    public node1061h myroot;

    public nodehelper1061h() {
        
    }

    public void add(String s) {
        node1061h something = new node1061h(s);
        if(myroot == null){
            myroot = something;
            return;
        }
        if(myroot.myNext == null){
            if(myroot.getStr().compareTo(s) < 0){
                myroot.myNext = something;
            }
            else{
                something.myNext = myroot;
                myroot = something;
            }
            return;
        }
        node1061h current = myroot;
        if(current.getStr().compareTo(s) > 0){
            something.myNext = myroot;
            myroot = something;
            return;
        }
        while (current.myNext != null) {
            if(current.myNext.getStr().compareTo(s) > 0){
                something.myNext = current.myNext;
                current.myNext = something;
                return;
            }
            current = current.myNext;
        }
        
        current.myNext = something;
    }

    public String print() {
        String str = "";
        node1061h temp = myroot;

        while (temp != null) {
            str = str+ " " + temp.getStr();
            temp = temp.myNext;
        }
        return str;
    }

    public boolean delete(String index) {

        if (myroot == null) {
            return false;
        }

        if (index.equals(myroot.getStr())) {
            myroot = myroot.myNext;
            return true;
        }
        node1061h current = myroot;
        while (current.myNext != null && !current.myNext.getStr().equals(index)) {

            current = current.myNext;
        }
        if (current.myNext != null && current.myNext.getStr().equals(index)) {
            current.myNext = current.myNext.myNext;
        }

        return true;
    }

    }