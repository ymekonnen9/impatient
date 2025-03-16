package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.zip.InflaterInputStream;

public class FileTreeMap {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get(null);

    try{
        BufferedReader reader = new BufferedReader(new FileReader(""));
   
        HashMap<String, Integer> hastre = new HashMap<>();
        String line;
        while((line = reader.readLine())!=null){
          for (String word : line.split("\\s+")) {
            if(hastre.get(word) != null){
              hastre.put(word, hastre.get(word) + 1);
            }else{
              hastre.put(word, 1);
            }
          }
        }
        
        TreeMap<String, Integer> tre = new TreeMap<>(hastre);
        System.out.println(tre.toString());
    }catch(IOException e){
      e.printStackTrace();
    };
  }
}
