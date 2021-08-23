package mocktest1;

public class animal {

	 protected int age;
	   protected boolean gender;
	   protected boolean mammal;
	   protected boolean mate;
	   public animal(int age2, boolean gender2, boolean mammal2, boolean mate2) {
		// TODO Auto-generated constructor stub
	}
	public void Animal( int Age, boolean Gender, boolean Mammal, boolean mate)
	    {
	       this.age = Age;
	       this.gender = Gender;
	       this.mammal = Mammal;
	       this.mate=mate;
	    }
	  public void SetAge(int n) { this.age = n; }
	  public void SetGenderMale() { this.gender=false; }
	  public void SetGenderFemale() { this.gender=true; }
	  public void SetMammal(boolean Mammal) { this.mammal = Mammal; } 
	  public int GetAge() { return(age); }
	  public boolean IsMammal() { return(mammal); }
	  public boolean GetGender() { return(gender); }
	  public boolean mate() {
		  return(mate);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
