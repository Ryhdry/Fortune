//import java.util.LinkedList;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException {
    
    int round=1;
    PlayerList plist = new PlayerList();
    System.out.println("Welcome to Wheel of Fortune"); 
    for (int i=1; i<=3; i++) {
    	Scanner nameObj = new Scanner(System.in);
    	System.out.println(" Enter Player "+ i +" Name: ");
        String pname = nameObj.nextLine();
    	plist.InsertAtFront(0, pname, i);
    }
    
    System.out.println("Press Enter To Continue...");
    new java.util.Scanner(System.in).nextLine();
    
    System.out.println("Here are the contestants"); 
    plist.DisplayList();
    
    while (round <= 3) {
    	Scanner catObj = new Scanner(System.in);
    	System.out.println("Select a Category for round: (Person, Place, Thing)"); 
    	String category = catObj.nextLine();
    	System.out.println(" Category: "+ category);
    	
    	PuzzleFile myObj = new PuzzleFile();
    	myObj.openFile();
    	myObj.addRecords();
    	myObj.closeFile();
    	
    	ReadFile r = new ReadFile();
    	r.openFile();
    	r.readFile(category);
    	r.closeFile();
    	
    	boolean solved = false;
    	for (int i = 1; i <= 3; i++) {
    		System.out.println("Round "+ i);
			while (solved == false) {
				System.out.println("The wheel now spin for Player %s..."+ i);
				list();
				
				Round roundObj;
				if (temp.getName.equals("Bankrupt") {
					roundObj.setRoundTotal(0, i);
					break;
				}
				else if (temp.getName.equals(" lose a turn") {
					break;
				}
	Scanner OpObj = new Scanner(System.in);
	System.out.println("Would you like to Guess, Solve or BuyVowel"+ i);
    String option = OpObj.nextLine();
    	if (option.equals("Guess")) {
    		while (true) {
			
				solved=true;
				round=4;
    }
    }
    }
    }
    
    
 private static void system(String string) {
		// TODO Auto-generated method stub
		
	}



private static void list() {
		LinkedList linkedList = new LinkedList();

        linkedList.insertAtFront(2500,"");
        linkedList.insertAtFront(0,"lose a turn");
        linkedList.insertAtFront(650,"");
        linkedList.insertAtFront(900,"");
        linkedList.insertAtFront(500,"");
        linkedList.insertAtFront(600,"");
        linkedList.insertAtFront(400,"");
        linkedList.insertAtFront(700,"");
        linkedList.insertAtFront(0,"Bankrupt");
        linkedList.insertAtFront(800,"");
        linkedList.insertAtFront(350,"");
        linkedList.insertAtFront(450,"");
        linkedList.insertAtFront(500,"");
        linkedList.insertAtFront(0,"Bankrupt");
        linkedList.insertAtFront(550,"");
        linkedList.insertAtFront(850,"free play");
        linkedList.insertAtFront(300,"");
        linkedList.insertAtFront(0,"lose a turn");
        linkedList.insertAtFront(650,"");
        linkedList.insertAtFront(700,"");
        linkedList.insertAtFront(800,"");
        linkedList.insertAtFront(950,"");
        linkedList.insertAtFront(900,"");
        linkedList.insertAtFront(0,"Bankrupt");
		
        linkedList.Spin();
	}
}
