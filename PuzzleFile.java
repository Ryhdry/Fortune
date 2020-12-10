import java.util.*;
import java.io.IOException;

public class PuzzleFile {
	  private Formatter x;
  public void openFile(){
    try {
    	x = new Formatter("puzzle.txt");
    } catch (IOException e) {
      System.out.println("An error occurred.");
    }
    }
  public void addRecords() {
	  x.format("%s%s\n", "Person ", "Usian");
	  x.format("%s%s\n", "Place ", "Jamaica");
	  x.format("%s%s\n", "Thing ", "Car");
  }
  public void closeFile() {
	  x.close();
}
}

