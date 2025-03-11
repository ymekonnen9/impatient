package generics;

public class Stack<E> {
  private Node top;
  private Node head;

  public Stack(){
    this.top = null;
  }

  public void push(E ele){
    Node<E> newNode = new Node<>(ele);
    if(top == null){
      top = newNode;
      head = newNode;
    }

    top.next = newNode;
    top = newNode;
  }

  public E pop()throws Exception{
    if(top == null){
      throw new Exception("stack is empty");
    }

    E returnType = (E) top.val;

    Node<Object> temp = head;

    while(temp != top){
      temp = temp.next;
    }
    temp = top;

    return returnType;

  }

  public boolean isEmpty(){
    if(head == null){
      return true;
    }
    return false;
  }
  
  public class Node<E>{
    private E val;
    private Node<Object> next;

    public Node(E e){
      this.val = e;
      this.next = null;
    }
  }
}
