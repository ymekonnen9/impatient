package collections;

import java.util.BitSet;

public class ErathostenesBitSet {
  public static void main(String[] args) {
    int n  = 81;
    BitSet era = new BitSet(n + 1);
    era.set(2, n + 1);

    for(int i = 0; i * i < n; i++){
      if(era.get(i)){
        for(int j = i * i; j < n; j +=i ){
          era.clear(j);
        }
      }
    }


    System.out.println(era.toString());
  }
}
