
public class Staff extends Employee{
	private int payGrade;
	public Staff(){
		super();
		payGrade = 1;
	}
	public Staff(String initialName, 
			int initialEmployeeID, 
			String initialEmployeeDepartment,
			int initialPayGrade){
		super(initialName, initialEmployeeID, initialEmployeeDepartment);
		setPayGrade(initialPayGrade); 
	}
	public void reset(String newName, int newEmployeeID, String newEmployeeDepartment, int newPayGrade){
		reset(newName, newEmployeeID, newEmployeeDepartment );
		setPayGrade(newPayGrade);
	}
	public int getPayGrade(){
		return payGrade;
	}
	public void setPayGrade(int newPayGrade){
		payGrade = newPayGrade;
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Employee pay grade: "+ payGrade);
	}
	
}
