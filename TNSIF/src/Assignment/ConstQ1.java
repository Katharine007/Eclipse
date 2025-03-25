package Assignment;

public class ConstQ1 {
	private String fname;
	private int roll;
	private char grade;
	private double percentage;

	//Constructors
	public ConstQ1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConstQ1(String fname, int roll, char grade, double percentage) {
		super();
		this.fname = fname;
		this.roll = roll;
		this.grade = grade;
		this.percentage = percentage;
	}
	
	//Getter and Setter
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	//ToString
	@Override
	public String toString() {
		return "ConstQ1 [fname=" + fname + ", roll=" + roll + ", grade=" + grade + ", percentage=" + percentage + "]";
	}

}
