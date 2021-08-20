package mocktest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Fish
{
	private int fishsize;
	
	public Fish(int s)
	{
		this.fishsize=s;
	}
	 public int Fishsize() {
	        return fishsize;
	    }
	
}
class Mycomparator implements Comparator<Fish>
{
	  public int compare(Fish e1, Fish e2) {
	        if(e1.Fishsize() < e2.Fishsize()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
}

public class Task3 {
	
	

	
	public static void main(String[] args) {
		
		 ArrayList<Fish> list = new ArrayList<Fish>();
	        list.add(new Fish(6));
	        list.add(new Fish(10));
	        list.add(new Fish(8));
	        list.add(new Fish(9));
	 
	        Collections.sort(list,new Mycomparator());
	 
	        System.out.println("After Sorting");
	        
	        
	            System.out.println(list);
	        
		

	}

}
