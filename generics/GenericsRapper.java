package generics;

import java.util.ArrayList;

public class GenericsRapper {

  private static <T> void swapHelper(ArrayList<T> eles, int i , int j){
    T temp = eles.get(i);
    eles.add(i, eles.get(j));
    eles.add(j, temp);

  }

  private static void swap(ArrayList<?> elements, int i, int j){
     swapHelper(elements, i, j);
  }
  
}
