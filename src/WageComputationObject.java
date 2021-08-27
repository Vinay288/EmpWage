
public class WageComputationObject {
	public final int wagePerHour;
	public final int fullTimeHour;
	public final int partTimeHour;
	public final String companyName;
	private int totalWage;

	WageComputationObject(int wagePerHour, int fullTimeHour, int partTimeHour, String companyName) {

		this.wagePerHour = wagePerHour;
		this.fullTimeHour = fullTimeHour;
		this.partTimeHour = partTimeHour;
		this.companyName = companyName;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total employee wage for the company : " + companyName + " is: " + totalWage;
	}
}
