package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class swap {


  public static void swap(List<?> list, int i, int j){
     Object[] array;

    if(list.get(0) instanceof RandomAccess){
      RandomAccess ele = (RandomAccess) list.get(i);
      array = list.toArray();
      array[i] = array[j];
      array[j] = ele;
      list = Arrays.asList(array);
    }else{
      Collections.swap(list, i, j);
    }
  }

  public static void main(String[] args) {
    
  }
}
