import java.util.*;
import java.io.*;
public class AVLS {
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner (System.in);
		System.out.println("what kind of problem would you like to solve?");
		System.out.println("please enter bookstore or garage");
		String key_word = scan.next();
		switch(key_word){
			case "bookstore":
				System.out.println("initiating bookstore problem");
				createFile("bookstore");
				
				break;
			case "garage":
				System.out.println("initiating garage problem");
				createFile("garage");
				
				break;
			default:
				System.out.println("please re-enter one of the two key words");
		}
		
	}
	
	public static void createFile(String FN) throws NumberFormatException, IOException {
		String fileName = FN;
	    // I am assuming that there is four line in input file and each line contains one set of data
	    FileReader fr = new FileReader(fileName);
	    BufferedReader br = new BufferedReader(fr);
	    String line;
	    while((line =br.readLine()) != null){
	        if(line!= null && line.trim().length() > 0){
	            // splitting line by space
	            String[] strArr = line.split("\\s+");
	            // now creating int array of size equal to strArr size
	            String[] arr = new String[strArr.length];
	            for(int i=0; i<arr.length; i++){
	                arr[i] = (strArr[i]);
	            }//end of for loop
	        }//end of if statement
	   }//end of while loop
	}//end of create file 
	
	
}//end of AVL class
