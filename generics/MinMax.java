package generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
  public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result){
    T min = elements.get(0);
    T max = elements.get(0);

    for(int i = 0; i < elements.size(); i++){
       if(comp.compare(elements.get(i), min) < 0){
          min = elements.get(i);
       }

       if(comp.compare(elements.get(i), max ) > 0){
        max = elements.get(i);
     }

    }

    result.add(min);
    result.add(max);
  }
}
