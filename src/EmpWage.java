
public class EmpWage {
	public static void main(String[] args) {
		System.out.println("*******welcome to emp wage calculator");
		int attendence = (int) Math.floor((Math.random() * 10) % 3);

		final int WAGE_PER_HOUR = 20;
		final int HOUR_FULLTIME = 8;
		final int HOUR_PART_TIME = 4;

		int wage = WAGE_PER_HOUR * HOUR_PART_TIME * attendence;
		System.out.println("emp wage is " + wage);
	}

}
