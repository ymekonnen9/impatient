import java.util.ArrayList;
import java.util.Random;

public class RandomRange{
  public static int nextInt(Random gen, int low, int high){
    return low + gen.nextInt(high - low) + 1;
  }

  public static int randomElement(Random gen, int[] arr){
    return arr[gen.nextInt(arr.length - 1)];
  }
  public static int randomElement(Random gen, ArrayList<Integer> arr){
    return arr.get(gen.nextInt(arr.size() - 1));
  }

  public static void main(String[] args){
    Random gen = new Random();
    int r = RandomRange.nextInt(gen, 1, 100);
    System.out.println(r);
  }
}