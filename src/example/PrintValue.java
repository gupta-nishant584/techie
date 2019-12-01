package example;

public class PrintValue {
	
	public static void main (String args[]) {
		
		PrintValue instance = new PrintValue();
		Person person = instance.new Person();
		
		person.setName("Inside main Block");
		System.out.println(person.getName());
		instance.populateName(person);
		System.out.println(person.getName());
	}
	
	private void populateName(Person person) {
		person = new Person();
		person.setName("Inside Ppopulate name");
	}
	
	class Person{
		String name;
		
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return this.name;
		}
	}

}
