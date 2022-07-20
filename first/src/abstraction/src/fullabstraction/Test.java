package fullabstraction;

public class Test {

	public static void main(String[] args) {
		Car honda = new Honda();
		honda.go();
		honda.stop();
//		
//		Car toyota = new Toyoto();
//		toyota.go();
//		toyota.stop();
		
		Car car = new Toyoto();
		car.go();
		car.stop();
	}
	
}