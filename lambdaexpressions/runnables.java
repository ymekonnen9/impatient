package lambdaexpressions;

public class runnables {
  public Runnable returnRunnable(Runnable[] runners){
    return ()->{
      for (Runnable runnable : runners) {
          runnable.run();  
      }
    };
  }
}
