package mocktest1;

public class duck extends animal {

	   protected String beakColor;
	   public duck( String beak_color,int Age, boolean Gender, boolean Mammal, boolean mate)
	   {
	       super(Age,Gender,Mammal,mate);
	        this.beakColor = beak_color;
	   }
	   public String GetBeakColor() { return(beakColor); }
	  public void  swim() { System.out.println("swimming...");  }
	  public void quack() {  System.out.println("quack"); }
	  @Override
	  public boolean mate() {
	 	  return(mate);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
