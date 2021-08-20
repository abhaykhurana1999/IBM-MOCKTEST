package mocktest1;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> list= new ArrayList<String>();
		 File file =
			      new File("C:\\Users\\002CJS744\\Desktop\\New folder\\Task 2.txt");
			    Scanner sc = null;
				try {
					sc = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  
			    while (sc.hasNextLine())
			      list.add(sc.next());
		
			    System.out.println(list);
	}

}
