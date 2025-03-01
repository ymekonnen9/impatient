public class Queue {

  private Node head;
  private Node tail;

  public Queue(){
    this.head = null;
    this.tail = null;
  }

  public class Node{
    private int val;
    private Node next;

    public Node(int val){
      this.val = val;
      this.next = null;
    }
  }

  public void add(int val){
    Node e = new Node(val);

    if(head == null){
      head = e;
      tail = e;
    }else{
      tail.next = e;
      tail = e;
    }
  }

  public int remove() throws Exception{
    if(head == null){
      throw new Exception("It's empty");
    }  

    int num = head.val;

    head = head.next;

    if(head == null){
      tail = null;
    }

    return num;
  }

  public class QueueIterator{
    private Node current;

    public QueueIterator(Node start){
        this.current = start;
    }

    public boolean hasNext(){
      return current != null;
    }

    public int next() throws Exception{
      if(current == null){
        throw new Exception("there is no next");
      }
      
      int num = current.val;
      current = current.next;

      return num;
    }
  }

  public QueueIterator iterator(){
    return new QueueIterator(head);
  }

  public static void main(String[] args) throws Exception {
    Queue myQueue = new Queue();
    myQueue.add(1);
    myQueue.add(2);
    myQueue.add(1);
    myQueue.add(2);
    myQueue.add(1);
    myQueue.add(2);
   
    Queue.QueueIterator iter = myQueue.iterator();

    while(iter.hasNext()){
      System.out.println(iter.next());
    }

  }
}
