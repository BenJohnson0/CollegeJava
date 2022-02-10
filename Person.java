package Tests;

public class Person {

	 
	// note attributes are private to support encapsulation
		private String name;
		private String streetAddress;
		private String city;
			
		// constructor which initializes the instance variables
		public Person(String name)
		{
			this.name = name;
		}
		// constructor which initializes the instance variables
		public Person(String name, String address,String city)
		{
			this.name = name;
			this.streetAddress = address;
			this.city = city; 
		}
			
			// override toString method to allow printing of Person 	   details
			public String toString()
			{
				String str = "This person is ";
				str+=name+", who lives at ";
				str+=streetAddress+", ";
				str+=city;
				return str;
			}
		
			public static void main(String[] args)
			{
				Person p1=new Person("Ben", "123 Hello Road", "Dublin");
				String s = p1.toString();
				System.out.println(s);
	
			}	

}
