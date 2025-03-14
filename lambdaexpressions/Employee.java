package lambdaexpressions;

public class Employee implements Measurable, Comparable<Employee> {
  private String firstName;
  private String lastName;
  private double salary;

  public Employee(String firstName, String lastName, double salary){
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
  }

  
  public double getMeasure(){
    return this.salary;
  }

  public String getFirstName(){
    return firstName;
  }

  public static Measurable largest(Measurable[] objects){
    Measurable max = objects[0];

    for (Measurable measurable : objects) {
      if(measurable.getMeasure() > max.getMeasure()){
        max = measurable;
      }
    }
     
    return max;
    
  }


  public static double average(Measurable[] objects){
    double sum = 0;

    for (Measurable measurable : objects) {
      sum += measurable.getMeasure();
    }

    return (double) sum/objects.length;
  }



    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", "Smith", 50000),
            new Employee("Bob", "Johnson", 60000),
            new Employee("Charlie", "Brown", 55000)
        };

        double avgSalary = Employee.average(employees);
        String larSalaryName = ((Employee) Employee.largest(employees)).getFirstName();

        System.out.println("Average Salary: " + avgSalary);
        System.out.println("Average Salary: " + larSalaryName);


      }


    @Override
    public int compareTo(Employee o) {
        return (int) (this.salary - o.salary);
    }

}
