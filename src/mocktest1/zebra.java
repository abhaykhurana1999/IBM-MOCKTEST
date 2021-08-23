package mocktest1;

public class zebra extends animal{

protected boolean is_wild;
	
	zebra (boolean is_wild, int Age, boolean Gender, boolean Mammal, boolean mate)
	  {
	     super(Age,Gender,Mammal, mate);
	     this.is_wild = is_wild;
	  }
	public boolean is_wild()
	{
		return(is_wild);
		}
	public void run()
	{
		System.out.println("running");
		}
}
