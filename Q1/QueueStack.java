public class QueueStack {

    public int code;
    public int quant;
    public double cost;
    public QueueStack next;
    public QueueStack prev;

    public QueueStack(int id, int amount, double value){
        this.code = id;
        this.quant = amount;
        this.cost = value;
        this.next = null;
    }
    public int sell(int amount) {
      quant -= amount;
      return quant;
    }

      
  }