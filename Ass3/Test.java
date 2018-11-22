package Ass3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Shapes s;
		System.out.println("1.Circle \t 2.Square \t 3.Triangle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the draw shape");
		int value = sc.nextInt();
		switch(value) {
		case 1:s=new Circle();
			   s.area(5);
			   break;
		case 2:s=new Square();
			   s.area(10);
			   break;
		case 3:s=new Traiangle();
			   s.area(5,6);
			   break;
		   	   
		}
	}

}
