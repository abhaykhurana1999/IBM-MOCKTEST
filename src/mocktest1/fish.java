package mocktest1;

public class fish extends animal {

	 protected int size;
	  protected boolean canEat;
	  fish (int n, boolean canEat, int Age, boolean Gender, boolean Mammal, boolean mate)
	  {
	     super(Age,Gender,Mammal, mate);
	     size = n;
	     this.canEat = canEat;
	  }
	  public int GetSize() { return(size); }
	  public boolean canEat() { return(canEat); }
	  public void swim() { System.out.println("swimming...."); }
	 @Override public boolean mate() {
		  return(mate);
	 }

}
