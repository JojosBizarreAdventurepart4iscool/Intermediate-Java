public class QueueStackhelper {
    

    
    private QueueStack head;

    public QueueStackhelper(){
        this.head = null;

    }
    public void buy(int c, int q, double cost){
        QueueStack current = new QueueStack(c, q, cost);
        QueueStack temp = head;
        if(head == null) {
            head = current;
        }else{
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = current;
      current.prev = temp;
    }
  }

    public void sell(int c, int q){
        QueueStack temp = head;
        while(temp.next != null){
          temp = temp.next;
        }if(temp.quant > q){
        temp.quant -= q;
    }
    else{
      boolean qZero = false;
      while(qZero == false){
        q -= temp.quant;
        if(q <= 0){
          temp.quant = Math.abs(q);
          qZero = true;
        }
        else{
        temp = temp.prev;
        temp.next = null;
      }
    }
    }
  }

  public void printAll(){
    QueueStack temp = head;
    while(temp != null){
      System.out.println(temp.code + " " + temp.quant + " " + temp.cost);
      temp = temp.next;
    }

  }

    public String peek(){
        QueueStack temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      return temp.code + " " + temp.quant + " " + temp.cost;
    }
    }

