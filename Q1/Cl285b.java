public class Cl285b implements Comparable<Cl285b>{
    private int id;
    private int code;
    private double sales; 
    private double comm;

    private double calc(){
        double temp = 0;
         if(code == 17 && sales <= 3500){
            comm = 0.095*sales;
        }
        else if(code==17 && sales > 3500){
            comm = 0.095*3500;
            temp = sales-3500;
            comm += 0.12 * temp;
        }
        else if((code == 5 || code == 8) && sales <= 5000){
            comm = sales *0.075;
        }
         else if((code == 5 || code == 8) && sales > 5000){
            comm = 5000*0.075;
            temp = sales-5000;
            comm += temp * 0.085;
        }
        else{
            return -1;
        }
        return comm;
    }

    public Cl285b(int id, int code, double sales){
        this.id = id;
        this.code = code;
        this.sales = sales;
        this.comm = 0;
        calc();
    }

    public String toString(){
        return String.format("%d\t%d\t$%.2f\t$%.2f", id, code, sales,comm);
    }

    public int compareTo(Cl285b o) {return id - o.id;

    }
    
}
