package Ass3;

public abstract class Shapes {
	
	abstract void area(double ...a);
}
class Circle extends Shapes{
 
	
	void area(double... a) {
		for(double i:a)
		{
			System.out.println("Area of circle="+(i*3.14*i));
		}
	}
	
}
class Square extends Shapes {

	
	void area(double... a) {
		for(double i:a)
		{
			System.out.println("Area of Square="+(i*i));
		}
		
	}
	
}
class Traiangle extends Shapes{


	void area(double... a) {
		double ar=0.5;
		for(double i:a)
		{
			ar*=i;
		}
		System.out.println("Area of Square="+ar);
		
	}
	
}