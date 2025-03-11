package generics;

import java.util.Arrays;

public class Dubles {
  private static <T> T[] swap(int i, int j, T... values){
      T temp = values[i];
      values[i] = values[j];
      values[j] = temp;
      return values;
  }

  public static void main(String[] args){
    Double[] result =  Dubles.<Double>swap(0, 1, 1.5, 2.0,3.0);
    System.out.println(Arrays.toString(result));
  }
}
