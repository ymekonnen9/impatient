import java.util.ArrayList;
import java.util.Scanner;

public class Array{

    public static ArrayList<ArrayList<Integer>> triangle (int n){
             
            ArrayList<ArrayList<Integer>> tri = new ArrayList<>();
            for(int i = 0; i< n; i++){
                ArrayList<Integer> row = new ArrayList<>();
                for(int j = 0; j <= i; j++){
                    if(j == 0 || j == i){
                        row.add(1);
                    }else{
                        row.add(tri.get(i-1).get(j-1) + tri.get(i-1).get(j));
                    }
                }
                tri.add(row);
            }
    
            return tri;
        }
    
        public static void main(String []  args){
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            input.close();
            ArrayList<ArrayList<Integer>> retu = triangle(num);

            for(ArrayList<Integer> inte : retu){
                System.out.println(inte);
            }
    }
}