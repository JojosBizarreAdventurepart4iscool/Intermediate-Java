import java.util.Queue;

public class QueueStack {

    public int code;
    public int quant;
    public double cost;
    private QueueStack head;
    private QueueStack next;

    public QueueStack(int id, int amount, double value){
        this.code = id;
        this.quant = amount;
        this.cost = value;
        this.next = null;
    }
    public void buy(int c, int q, double cost){
        QueueStack current = new QueueStack(c, q, cost);
      for(int x = 0; x < c; x++){
        current = current.next;
      }
      current.next.quant += current.quant;
      current.next.cost += current.cost;
    }
    public void sell(int c, int q){
        QueueStack current = new QueueStack(c, q, 0);
      for(int x = 0; x < c; x++){
        current = current.next;
      }
    current.next.quant -= current.quant;

    }
    }
