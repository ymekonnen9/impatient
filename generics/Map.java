package generics;

import java.util.ArrayList;
import java.util.function.Function;

public class Map {
  public static <E,T, R> ArrayList<E> map(ArrayList<E> lists, Function<T, R> obj, ArrayList<T> results){
     for (E  it : lists) {
      results.add((T) obj.apply((T) it));
     }
     return (ArrayList<E>) results;
  }
}
