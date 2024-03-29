package circulerqueue;

public class CircularQueue{
 static int arr[];
  static int size;
  static int rear= -1;
  static int front = -1;
  
public  CircularQueue(int n){
    arr = new int[n];
    this.size = n;
  }
  public static boolean Cir_isEmpty(){
    return rear == -1 && front == -1;
  }
  public static boolean Cir_isFull(){
    return (rear+1)%size == front;
  }
  //enquque = add
  public static void Cir_enqueue(int data){
    if(Cir_isFull()){
      System.out.println("Queue is full");
      return;
    }
    if(front == -1){
      front = 0;
    }
    rear =  (rear+1)%size;
    arr[rear] = data;
  }
  //dequeue = delete
  public static int Cir_dequeue(){
    if(Cir_isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    }
    int result = arr[front];
    if(front == rear){
      front = rear = -1;
    }
    else{
      front = (front+1)%size;
    }
    return result;
  }
  //peek = Fetch data
  public static int Cir_peek(){
    if(Cir_isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    }
    return arr[front];
  }
}