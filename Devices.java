package InterfaceDemo;

public interface Devices {
	
	 void switchON();
	abstract void switchOFF();
}

abstract class TV implements Devices{
	public abstract void switchON();
	TV(){
		System.out.println("Inside TV");
	}
}
class SamsungTV extends TV
{

	public void switchON() {
		System.out.println(" Samsung tv is ON");
	}

	public void switchOFF() {
		System.out.println(" Samsung tv is OFF");
	}
	
}
class SonyTV extends TV
{

	public void switchON() {
		System.out.println(" Sony tv is ON");
	}

	public void switchOFF() {
		System.out.println(" Sony tv is OFF");
	}
	
}

abstract class Lamp implements Devices{
	public abstract void switchON();
	Lamp(){
		System.out.println("Inside Lamp");
	}
}

class  Philips extends Lamp
{

	public void switchON() {
		System.out.println(" Philips lamp is ON");
	}

	public void switchOFF() {
		System.out.println(" Philips lamp is OFF");
	}
	
}

class Mercury extends Lamp
{

	public void switchON() {
		System.out.println(" Mercury lamp is ON");
	}

	public void switchOFF() {
		System.out.println(" Mercury lamp is OFF");
	}
	
}