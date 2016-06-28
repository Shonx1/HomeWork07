package Task;

public class Lecturer extends Person implements Methods {
	private String university;
	private final int hours = 10;

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Lecturer(String firstName, String lastName, String university) {
		super(firstName, lastName);
		this.university = university;
	}

	public Lecturer(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public void HomeWork() {
		System.out.println("I can check your homework");

	}

	public void ClassWork(String name, String name1, String name2) {
		name = "Mathematics";
		name1 = "Biology";
		name2 = "Geographic";
		System.out.println("The objects are " + name + " " + name1 + " " + name2);
	}

	@Override
	public void Hello() {
		System.out.print("Hello");

	}

}