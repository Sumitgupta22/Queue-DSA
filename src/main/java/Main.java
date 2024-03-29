// import static org.junit.jupiter.api.Assertions.assertEquals;
import circulerqueue.CircularQueue;
import circulerqueue.Normal_QueueArray;

// import org.junit.jupiter.api.Test;


public class Main {
  public static void main(String[] args) {
    System.out.println("welcome to the queue");
    Normal_QueueArray q = new Normal_QueueArray(5);
    q.Arrenqueue(1);
    q.Arrenqueue(2);
    q.Arrenqueue(3);
    q.Arrenqueue(4);
    while(!q.ArrisEmpty()){
      System.out.println(q.Arrpeek());
      q.Arrdequeue();
    }
    System.out.println("welcome to the Circurequeue");
    CircularQueue cq = new CircularQueue(5);
    cq.Cir_enqueue(1);
    cq.Cir_enqueue(2);
    cq.Cir_enqueue(3);
    cq.Cir_enqueue(4);
    cq.Cir_enqueue(5);
    
    cq.Cir_dequeue();
    cq.Cir_enqueue(6);
    cq.Cir_dequeue();
    cq.Cir_enqueue(7);
    while (!cq.Cir_isEmpty()){
      System.out.println(cq.Cir_peek());
     cq.Cir_dequeue();
    }
    
  }
  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}