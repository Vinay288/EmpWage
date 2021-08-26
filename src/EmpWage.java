
public class EmpWage {
	public static void main(String[] args) {
		System.out.println("*******welcome to emp wage calculator");
		WageComputation wage=new WageComputation(20,10,4,"1");
		WageComputation wage2=new WageComputation(50, 12, 6,"2");
		wage.calculateWage();
		wage2.calculateWage();
	}
}
