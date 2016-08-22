
public class Faculty extends Employee{
	private String title;
	public Faculty(){
		super();
		title = "Undifined Title";
	}
	public Faculty(String initialName, 
			int initialEmployeeID, 
			String initialEmployeeDepartment,
			String initialTitle){
		super(initialName, initialEmployeeID, initialEmployeeDepartment);
		setTitle(initialTitle); 
	}
	public void reset(String newName, int newEmployeeID, String newEmployeeDepartment, String newTitle){
		reset(newName, newEmployeeID, newEmployeeDepartment );
		setTitle(newTitle);
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String newTitle){
		title = newTitle;
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Faculty Title: "+ title);
	}
	public boolean equals(Faculty otherFaculty){
		return equals((Employee)otherFaculty) && 
				(this.title == otherFaculty.title);
	}
}
