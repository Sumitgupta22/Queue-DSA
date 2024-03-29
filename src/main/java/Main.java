// import static org.junit.jupiter.api.Assertions.assertEquals;
import circulerqueue.CircularQueue;
// import org.junit.jupiter.api.Test;
class Queue{
  static int arr[];
  static int size;
  static int rear= -1;
  Queue(int n){
    arr = new int[n];
    this.size = n;
  }
  public static boolean isEmpty(){
    return rear == -1;
  }
  //enquque = add
  public static void enqueue(int data){
    if(rear == size-1){
      System.out.println("Queue is full");
      return;
    }
    rear++;
    arr[rear] = data;
  }
  //dequeue = delete 
  public static int dequeue(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    }
    int front = arr[0];
    for(int i=0; i<rear; i++){
      arr[i] = arr[i+1];
    }
    rear--;
    return front;
  }
  //peek = Fetch data 
  public static int peek(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    }
    return arr[0];
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("welcome to the queue");
    Queue q = new Queue(5);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.dequeue();
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