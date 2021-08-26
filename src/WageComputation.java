
public class WageComputation {
	private final int WAGE_PER_HOUR = 20;
	private final int HOUR_FULLTIME = 8;
	private final int HOUR_PART_TIME = 4;
public void calculateWage() {
	int workedHour = 0, totalWage = 0,totalWorkingHour=0,totalDays=0;
		while(totalWorkingHour<100 && totalDays<20) {
		int attendence = attendence();
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
		totalWorkingHour=totalWorkingHour+workedHour;
		totalDays++;
		totalWage = totalWage + WAGE_PER_HOUR * workedHour * attendence;
	}
	System.out.println("emp wage is " + totalWage);
}
public int attendence() {
	return (int) Math.floor((Math.random() * 10) % 3);
}
}
