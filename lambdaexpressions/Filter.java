package lambdaexpressions;

import java.io.File;

@FunctionalInterface
public interface Filter {
  File[] filter(String directName);
}
