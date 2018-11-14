/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {

	int res=0;
	int val=Integer.parseInt(args[0]);
	while(val>0){
	    res=((res*10)+(val%10));
	    if(val>9)
	    val/=10;
	    else
	    val=0;
	}
       if(res==(Integer.parseInt(args[0])))
       System.out.println("Palindrome");
       else
       System.out.println("Not a Palindrome");
       
System.out.println(res);
	
	}
}
