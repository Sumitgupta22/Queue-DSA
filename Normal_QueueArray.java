package circulerqueue;
public class Normal_QueueArray{
  static int arr[];
  static int size;
  static int rear= -1;
 public Normal_QueueArray(int n){
    arr = new int[n];
    this.size = n;
  }
  public static boolean ArrisEmpty(){
    return rear == -1;
  }
  //enquque = add
  public static void Arrenqueue(int data){
    if(rear == size-1){
      System.out.println("Queue is full");
      return;
    }
    rear++;
    arr[rear] = data;
  }
  //dequeue = delete 
  public static int Arrdequeue(){
    if(ArrisEmpty()){
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
  public static int Arrpeek(){
    if(ArrisEmpty()){
      System.out.println("Queue is empty");
      return -1;
    }
    return arr[0];
  }
}