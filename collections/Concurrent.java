package collections;

import java.util.ArrayList;

public class Concurrent {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    Runnable r1 = () -> {
     for(int i = 0; i < 100; i++){
      strings.add(i, "Yared");
     }
    };

    Runnable r2 = () -> {
      for(int i = 0; i < 100; i++){
        strings.add(i, "Yared");
       }
    };

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
  }
}
