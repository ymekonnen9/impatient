package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Uppercase {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    Iterator iter = strings.iterator();

    while(iter.hasNext()){
      iter.next().toString().toLowerCase();
    }

    for(int i = 0; i< strings.size(); i++){
      strings.set(i, strings.get(i).toLowerCase());
    }

    strings.replaceAll( e -> e.toLowerCase());
  }
}
