package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class lucky {
  private static void luckySort(ArrayList<String> strings, Comparator<String> comp){
      Collections.shuffle(strings);
  }
}
