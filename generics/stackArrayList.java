package generics;

import java.util.ArrayList;

public class stackArrayList<E> {
  private ArrayList<E> elements;

  public stackArrayList(){
    this.elements = new ArrayList<>();
  }

  public void push(E e){
    elements.add(e);
  }

  public E pop(){
    E top = elements.remove(elements.size()-1);
    return top;
  }

  public boolean isEmpty(){
    return elements.size() == 0;
  }
}
