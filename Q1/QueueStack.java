public class QueueStack {

    public int id;
    public int quant;
    public double value;
    public String input;
    public int id2;
    public int quant2;
    public double cost;

    public void checkInput(){
        if(input.equals("B")){
            quant += quant2;
            value += cost;
        }
        if(input.equals("S")){
            quant -= quant2;
            value -= cost;
        }
    }
}
