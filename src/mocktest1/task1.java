package mocktest1;

public class task1 {
	
	class animal
	{
		int age;
		String gender;
		
		public void isMammal()
		{
			System.out.println("Is Mammal");
		}
		public void mate()
		{
			System.out.println("Mated");
		}
		
	}
	class Duck extends animal
	{
		public String beakColor="yellow";
		
		 public void swim()
		{
			System.out.println("Can Swim");
		}
		public  void quack()
		{
			System.out.println("Is A duck");
		}
		
	}
	class  Fish extends animal
	{
		private int size;
		private boolean canEat;
		
		private void swim()
		{
			System.out.println("Is Swimming");
		}
		
	}
	class Zebra extends animal
	{
		
		public boolean is_wild;
		
		public void run()
		{
			System.out.println("Running");
		}
	}

	public static void main(String[] args) {
		
		//Methods And classes which have to implemented;
	}

}
