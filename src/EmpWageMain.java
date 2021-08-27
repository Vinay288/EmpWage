
public class EmpWageMain {
	public static void main(String[] args) {
		System.out.println("*******welcome to emp wage calculator");
		WageComputation empWage = new WageComputation();
		empWage.addCompany(20, 10, 5, "alpha");
		empWage.addCompany(30, 20, 10, "beta");
		empWage.calculateWage();
	}
}
