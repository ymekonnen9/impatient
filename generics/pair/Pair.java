package generics.pair;

import java.util.ArrayList;

public class Pair<E extends Comparable<E>>{
  private E first;
  private E second;

  public Pair(E first, E second){
      this.first = first;
      this.second = second;
  }

  public E getFirst(){
    return first;
  }

  public E getSecond(){
    return second;
  }

  public E max(){
     return (getFirst().compareTo(getSecond()) > 0) ? getFirst() : getSecond(); 
  }

  public E min(){
    return (getFirst().compareTo(getSecond()) < 0) ? getFirst() : getSecond();
  }


  public class Arrays{
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Pair<E> firstLast(ArrayList<Pair<E>> a){
      return new Pair(a.get(0).getFirst(), a.get(a.size()-1).getSecond());
    }

    public <E extends Comparable<E>> E min(Pair<E>[] pairs){
          E min = pairs[0].getFirst();

          for(int i = 0; i < pairs.length; i++){
            if(pairs[i].getFirst().compareTo(min) < -1){
              min = pairs[i].getFirst();
            }
          }

          for(int i = 0; i < pairs.length; i++){
            if(pairs[i].getSecond().compareTo(min) < -1){
              min = pairs[i].getSecond();
            }
          }
       
          return min;
    }


    public <E extends Comparable<E>> E max(Pair<E>[] pairs){
      E max = pairs[0].getFirst();

      for(int i = 0; i < pairs.length; i++){
        if(pairs[i].getFirst().compareTo(max) > 0){
          max = pairs[i].getFirst();
        }
      }

      for(int i = 0; i < pairs.length; i++){
        if(pairs[i].getSecond().compareTo(max) > 0){
          max = pairs[i].getSecond();
        }
      }
   
      return max;
}

  public <E extends Comparable<E>> Pair<E> minMax(Pair<E>[] pairs){
      E min = min(pairs);
      E max = max(pairs);
      return new Pair<E>(min, max);
  }
  }



}
