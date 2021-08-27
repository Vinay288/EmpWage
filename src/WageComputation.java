
public class WageComputation {
	private int numberOfCompany = 0;
	private WageComputationObject wageComputationArray[];

	WageComputation() {

		wageComputationArray = new WageComputationObject[5];
	}

	public void addCompany(int wagePerHour, int fullTimeHour, int partTimeHour, String companyName) {
		wageComputationArray[numberOfCompany] = new WageComputationObject(wagePerHour, fullTimeHour, partTimeHour,
				companyName);
		numberOfCompany++;
	}

	public void calculateWage() {
		for (int i = 0; i < numberOfCompany; i++) {
			wageComputationArray[i].setTotalWage(this.calculateWage(wageComputationArray[i]));
			System.out.println(wageComputationArray[i]);
		}
	}

	public int calculateWage(WageComputationObject wageComputationObject) {
		int workedHour = 0, totalWorkingHour = 0, totalDays = 0;
		while (totalWorkingHour < 100 && totalDays < 20) {
			int attendence = attendence();
			switch (attendence) {
			case 0:
				workedHour = 0;
				break;
			case 1:
				workedHour = wageComputationObject.fullTimeHour;
				break;
			case 2:
				workedHour = wageComputationObject.partTimeHour;
				break;
			default:
				System.out.println("error");
			}
			totalWorkingHour = totalWorkingHour + workedHour;
			totalDays++;
			;
		}
		return totalWorkingHour * wageComputationObject.wagePerHour;
	}

	public int attendence() {
		return (int) Math.floor((Math.random() * 10) % 3);
	}

}
