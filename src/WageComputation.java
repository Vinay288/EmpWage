
public class WageComputation {
	private int wagePerHour;
	private int fullTimeHour;
	private int partTimeHour;
	private String companyName;
	private int totalWage;

	WageComputation(int wagePerHour, int fullTimeHour, int partTimeHour, String companyName) {

		this.wagePerHour = wagePerHour;
		this.fullTimeHour = fullTimeHour;
		this.partTimeHour = partTimeHour;
		this.companyName = companyName;
	}
	public void addCompany(int wagePerHour,int fullTimeHour,int partTimeHour,String companyName) {
		
	}

	public void calculateWage() {
		int workedHour = 0, totalWorkingHour = 0, totalDays = 0;
		while (totalWorkingHour < 100 && totalDays < 20) {
			int attendence = attendence();
			switch (attendence) {
			case 0:
				workedHour = 0;
				break;
			case 1:
				workedHour = fullTimeHour;
				break;
			case 2:
				workedHour = partTimeHour;
				break;
			default:
				System.out.println("error");
			}
			totalWorkingHour = totalWorkingHour + workedHour;
			totalDays++;
			totalWage = totalWage + wagePerHour * workedHour * attendence;
		}
		System.out.println("emp wage of " + this.companyName + " is " + totalWage);
	}

	public int attendence() {
		return (int) Math.floor((Math.random() * 10) % 3);
	}

	public int getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getFullTimeHour() {
		return fullTimeHour;
	}

	public void setfullTimeHour(int fullTimeHour) {
		this.fullTimeHour = fullTimeHour;
	}

	public int getPartTimeHour() {
		return partTimeHour;
	}

	public void setpartTimeHour(int partTimeHour) {
		this.partTimeHour = partTimeHour;
	}
	
	@Override
	public String toString()
	{
		return "Total employee wage for the company : "+companyName+" is: "+totalWage;
	}
}
