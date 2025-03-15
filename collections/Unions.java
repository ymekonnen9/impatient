package collections;

import java.util.HashSet;
import java.util.Set;

public class Unions {
  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
    Set<String> strings2 = new HashSet<>();

    strings.addAll(strings2);
    strings.retainAll(strings2);
    strings.removeAll(strings2);
  }
}
