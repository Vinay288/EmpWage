
public class EmpWage {
	public static void main(String[] args) {
		System.out.println("*******welcome to emp wage calculator");
		
		int attendence = (int) Math.floor(Math.random() * 10) % 2;
		
		final int WAGE_PER_HOUR = 20;
		final int HOUR_PER_DAY = 8;
		
		int wage = WAGE_PER_HOUR * HOUR_PER_DAY * attendence;
		System.out.println("emp wage is "+wage);
	}

}
