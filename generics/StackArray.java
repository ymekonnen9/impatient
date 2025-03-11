package generics;

public class StackArray<E> {
  private E[] elements;

  public void push(E e){
    if(elements == null){
      elements[0] = e;
    }
    elements[elements.length] = e;
  }

  @SuppressWarnings("unchecked")
  public E pop(){
    E top = elements[elements.length-1];
    if(elements.length >=2){
      elements = (E[]) elements[elements.length-2];
    }
    return top;
  }

  public boolean isEmpty(){
    return elements.length == 0;
  }
}
