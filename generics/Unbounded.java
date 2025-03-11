package generics;

import java.util.ArrayList;

public class Unbounded {
  public static boolean hasNull(ArrayList<?> arrays){
    for (Object obj : arrays) {
      if(obj == null){
        return true;
      }
    }
        return false;
  }
}
