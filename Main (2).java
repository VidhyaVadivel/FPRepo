/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
	 int[][] mat = new int[10][10];
	 int x=1;
        mat[(Integer.parseInt(args[1]))-x][(Integer.parseInt(args[2]))-x]=Integer.parseInt(args[0]);
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.print(mat[j][i]);
            }
            System.out.println();
        }
        
	}
}
