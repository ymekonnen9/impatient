package generics;
import lambdaexpressions.*;

public class ClassPredicate {
  public static void printAll(Employee[] Objects, Predicate<? super Employee> filter){
      for (Employee objects2 : Objects) {
        if(filter.test(objects2)){
          System.out.println(objects2.getFirstName());
        };
      }
  }

  public static void main(String[] args) {
    Employee[] employees = {
      new Employee("Alice", "Smith", 50000),
      new Employee("Bob", "Johnson", 60000),
      new Employee("Charlie", "Brown", 55000)
  };
  ClassPredicate.printAll(employees, (e) -> e.getMeasure() >= 1000);

  }
}
