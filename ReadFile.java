import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class ReadFile {
	private Scanner x;
  public void openFile () {
    try {
    	x=new Scanner (new File("puzzle.txt"));
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
    }
  }
  
  //Round roundObj;
 public void readFile(String category) {
	 while(x.hasNext()) {
		 String a = x.next();
		 String b = x.next();
		 if(a.equals(category)) {
			 System.out.printf(" Puzzle is:%s\n",b);
				//roundObj.setCategory(a);
				//roundObj.setPuzzle(b);
			}
	 }
 	}
 public void closeFile() {
	 x.close();
 }
}