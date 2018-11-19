package InterfaceDemo;

public class DeviceInterface {

	private Devices d;
	public void pressButton(Devices d) {
	this.d=d;
	d.switchON();
	d.switchOFF();
	}
}
