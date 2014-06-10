import java.util.*;
public class mat_start {
	
	public static void main(String args[])
	{
		char mat[][]=new char[10][10];
		int pr,pc;
		Scanner get = new Scanner (System.in);
		System.out.println("enter the point");
		pr = get.nextInt();
		pc = get.nextInt();
		pr--;pc--;
		initialise(mat);
		traverse(mat,pr,pc);
		display(mat);
		area(mat);
		
	}
	
	public static void initialise(char x[][])
	{
		for(int row=0;row<10;row++)
		{
			for( int column=0;column<10;column++)
			{
				x[row][column]='|';
			}
		}
	}
	
	public static void traverse(char x[][],int r,int c)
	{
		int rt=r,c1=c,c2=c;
		if(r==9)
		{
			x[r][c]='*';
		}
		else
		for(int count = 1;count <= (9-r);count++ )
		{
			x[rt][c1]=x[rt][c2]='*';
			rt++;
			c1=(c1>0 )?--c1:c1;
			c2=(c2<9)?++c2:c2;
			for(int cr=c1;cr<=c2;cr++)
			{
				x[rt][cr]='*';
			}
			
		}	
				
	}

	public static void display(char x[][])
	{
		for(int row=0;row<10;row++)
		{
			for(int column=0;column<10;column++)
			{
				System.out.print(x[row][column]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void area(char x[][])
	{
		int area=0;
		for(int row=0;row<10;row++)
		{
			for(int column=0;column<10;column++)
			{
				area=x[row][column]=='*'?++area:area;
			}
		}
		
		System.out.println("the area is" + area);
	}

}
