
public class EmpWage {
	public static void main(String[] args) {
		System.out.println("*******welcome to emp wage calculator");
		int attendence = (int) Math.floor((Math.random() * 10) % 3);

		final int WAGE_PER_HOUR = 20;
		final int HOUR_FULLTIME = 8;
		final int HOUR_PART_TIME = 4;
		int workedHour = 0;

		switch (attendence) {
		case 0:
			workedHour = 0;
			break;
		case 1:
			workedHour = HOUR_FULLTIME;
			break;
		case 2:
			workedHour = HOUR_PART_TIME;
			break;
		default:
			System.out.println("error");
		}
		int wage = WAGE_PER_HOUR * workedHour * attendence;
		System.out.println("emp wage is " + wage);
	}

}
