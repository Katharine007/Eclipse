package Assignment;
import java.util.Scanner;
public class Question1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);


System.out.println("Your Input : ");
String fname = sc.nextLine();
int roll=sc.nextInt();
char grade=sc.next().charAt(0);
double p=sc.nextDouble();

ConstQ1 ob = new ConstQ1(fname,roll,grade,p);

System.out.println();
System.out.println("Your Output : ");
System.out.println(ob.getFname());
System.out.println(ob.getRoll());
System.out.println(ob.getGrade());
System.out.println(ob.getPercentage()+"%");
	}

}
