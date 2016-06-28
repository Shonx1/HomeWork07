package Task;

public class Professor extends Lecturer {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Professor(String firstName, String lastName, String university, String title) {
		super(firstName, lastName, university);
		this.title = title;
	}

	public void Title(String name) {
		name = "Doctor";
		System.out.print("The title is " + name);
	}

}