package collections;

import java.util.HashSet;
import java.util.Set;

public class ErathostenesHash{
  public static void main(String[] args) {
    Set<Integer> era = new HashSet<>();
    int n = 81;

    for(int i = 2; i<= n; i++){
      era.add(i);
    }


    int smallest = 2;
    boolean isDone =false;

    while(!isDone){
      if(smallest*smallest > n){
        isDone = true;
      }
      for(int i = 0; i< n; i++){
        era.remove(smallest*(smallest + i));
      }
      smallest +=1;

    }
    System.err.println(era.toString());
    
  }
}