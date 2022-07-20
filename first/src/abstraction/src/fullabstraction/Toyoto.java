package fullabstraction;

public class Toyoto implements Car{

	@Override
	public void go() {
		System.out.println("Inside Toyota go");
	}

	@Override
	public void stop() {
		System.out.println("Inside Toyoto stop");
	}

}

