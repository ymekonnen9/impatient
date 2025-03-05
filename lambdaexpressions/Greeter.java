package lambdaexpressions;

public class Greeter implements Runnable{
    private int n;
    private String target;

    public Greeter(int n, String target){
      this.n = n;
      this.target = target;
    }

    public void run(){
      for(int i =0; i < n; i++){
        System.out.println("Hello" + this.target);
      }
    }


    public static void main(String[] args) {
      Greeter greet1 = new Greeter(6, "Yared");
      Greeter greet2 = new Greeter(6, "Mekonnen");

      Thread thread1 = new Thread(greet1);
      Thread thread2 = new Thread(greet2);

      thread1.start();
      thread2.start();
    }




  
}