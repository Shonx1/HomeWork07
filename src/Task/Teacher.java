package Task;


public class Teacher extends Person {
	private String object;

	public Teacher(String firstName, String lastName, String object) {
		super(firstName, lastName);
		this.object = object;
	}

	public Teacher(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}
	public void Hello(){
		System.out.println("Hello");
	}
	public void Goodbye(){
		System.out.println("Goodbye");
	}
	public void HomeWork(){
		System.out.println("I can check your homework");
	}
}