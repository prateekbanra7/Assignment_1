// 1.Write a program(WAP) to print INEURON using pattern programming logic


package Assignment_1;

public class pattern_1 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j==(n-1)/2) // I
					System.out.print("*");
				else
					System.out.print(" ");			
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==j ) // N
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i==0  ||	i==(n-1)/2 || i==n-1 || j==0 ) // E
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				//if( j==0 || i==n-1 || j==n-1 ) // U
				if(j==0 && i!=n-1 ||
						j==n-1 && i<n-1 || i==n-1 && j>0 && j<n-1 ) // U
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0 || j==n-1 && i<n-2||
						i==(n-1)/2 || i-j+1==(n-1)/2) // R
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 ||
						j==n-1 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1 ) // O
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1 || i==j ) // N
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.println();
		}
		
		
		
	}

}
