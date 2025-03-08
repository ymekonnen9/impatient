package lambdaexpressions;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FilterFiles{
  public static void main(String[] args) {
    Filter filli = (String dirName) -> {

      File directory = new File(dirName);

      if (!directory.isDirectory()) {
        System.out.println("Invalid directory: " + dirName);
        return new File[0]; 
    }

      String[] myDirectories = directory.list(new FilenameFilter() {
        public boolean accept(File dir, String name){
           return new File(directory, name).isDirectory();
        };
      });

      if (myDirectories == null) return new File[0]; 

  
      ArrayList<File> returnSubDirs = new ArrayList<>();
  
      for (String stringSubDir : myDirectories) {
        File subDir = new File(directory, stringSubDir);
        returnSubDirs.add(subDir);
      }
        
        return returnSubDirs.toArray(new File[0]);

    };

    File[] directories = filli.filter("/home/yared9/impatient/lambdaexpressions");
        
    for (File dir : directories) {
        System.out.println(dir.getAbsolutePath());
    }

  }
}
