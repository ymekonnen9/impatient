package lambdaexpressions;

public class Runners {
  private static void runTogether(Runnable... tasks){ 
    for (Runnable runnable : tasks) {
        Thread t = new Thread(runnable);
        t.start();
      }
     return;
  }

  private static void runInOrder(Runnable... tasks){

     for (Runnable runnable : tasks) {
      runnable.run();
     }
    return;
  }

  public static void main(String[] args) {
    Runnable task1 = () -> {System.out.println("Task 1 running in " + Thread.currentThread());};
    Runnable task2 = () -> {System.out.println("Task2 running in thread" + Thread.currentThread());};
    Runnable task3 = () -> {System.out.println("Task 3 is running in" + Thread.currentThread());};

    runInOrder(task1, task2, task3);
    runTogether(task1, task2, task3);
  }

}
