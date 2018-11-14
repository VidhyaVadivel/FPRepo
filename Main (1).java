/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	 int res=1;
	    for(int i=Integer.parseInt(args[0]);i>0;i--)
	    {
	        res=res*i;
	    }
	    System.out.println("Factorised value:"+res);
		
	}
}
