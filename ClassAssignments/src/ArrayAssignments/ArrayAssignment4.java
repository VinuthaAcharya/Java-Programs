package ArrayAssignments;

public class ArrayAssignment4 
{
	public static void main(String[] args) 
	{
		String city[]=new String[4];
		city[0]="Udupi    ";
		city[1]="Mumbai   ";
		city[2]="Mangalore";
		city[3]="Delhi    ";
		
		boolean ans[]=new boolean[4];
		ans[0]=true;
		ans[1]=false;
		ans[2]=true;
		ans[3]=false;
		
		String msg[]=new String[2];
		msg[0]="You have been there";
		msg[1]="You will visit soon to each city";
				
		for(int i=0;i<4;i++)
		{
		System.out.print(city[i]);
		System.out.print("    "+ans[i]);
		if(ans[i]==true)
		{
			System.out.print("    "+msg[0]);
		}
		else
		{
			System.out.print("    "+msg[1]);
		}
		System.out.println("");
		}
	}

}
