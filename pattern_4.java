/*4. WAP to print
 * 
 * 
 *  *       *
 * 	*       *
 * 	**	   **
 *  ***	  ***
 *  **** ****
 * 	*********
 * 
 * 
 * 
 */
package Assignment_1;

public class pattern_4 {

	public static void main(String[] args) {
		
		int n=15;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(j==0 && j!=0 || i==n-1 || j==n-1 && j!=n-1 ||
						i-j>=(n-1)/2 || i+j>=n+(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
