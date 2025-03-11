package generics;

import java.util.ArrayList;

public class Closable {
  public static <T extends AutoCloseable> void closeAll(ArrayList<T> arrays)throws Exception{

   for (T t : arrays) t.close();
    
  }
}
