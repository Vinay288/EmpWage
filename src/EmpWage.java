
public class EmpWage {
	public static void main(String[] args) {
		System.out.println("*******welcome to emp wage calculator");
		WageComputation wage1=new WageComputation(20,10,4,"benz");
		WageComputation wage2=new WageComputation(50, 12, 6,"maruti");
		wage1.calculateWage();
		System.out.println(wage1);
		wage2.calculateWage();
		System.out.println(wage2);
		
	}
}
