package generics;

import java.util.ArrayList;

import lambdaexpressions.Employee;

public class Appends {
  private static <E extends Employee> void append(ArrayList<E> reciever, ArrayList<E> tobeadded ){
      for (E ele : tobeadded) {
        reciever.add(ele);
      }
  }
  
}
