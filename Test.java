package InterfaceDemo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Samsung TV\n2.Sony TV\n3.Philips lamp\n4.Mercury Lamp");
		System.out.println("Enter the device");
		int device = sc.nextInt();
		Devices d;
		DeviceInterface di=new DeviceInterface();
		switch(device)
		{
		case 1: d = new SamsungTV();
				di.pressButton(d);
				break;
		case 2: d = new SonyTV();
				di.pressButton(d);
				break;
		case 3: d = new Philips();
				di.pressButton(d);
				break;
		case 4: d = new Mercury();
				di.pressButton(d);
				break;
		}
	//	di.pressButton(d);
	}

}
