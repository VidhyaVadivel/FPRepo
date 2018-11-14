/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		int sum=0,max=0,min=Integer.parseInt(args[0]);
		for(int i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		   
if(Integer.parseInt(args[i])>max)
max=Integer.parseInt(args[i]);
else
min=Integer.parseInt(args[i]);
		}
		 System.out.println("avg:"+(sum/args.length)+"max:"+max+"min:"+min);
		 
		
	}
}
