package Ass2;

public class Test {
	
	public static void main(String args[]) throws A,B,C{
		
		
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			//int res=n1/n2;
			if(n1!=0 && n2==0)
				throw new A();
			else if(n1==0)
				throw new B();
			else
				throw new C();
		}catch(Exception e)
		{
			System.out.println(e);		
		}
		
	}
}
