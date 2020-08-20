package PatternProgram;

import java.util.Scanner;

public class PatternPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=0;
		for(int i=1;i<=n;i++)
		{
			for(int sp=n;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int k=i;k != (2*i-1);k++)
			{
				l++;
				if(k!=i)
				System.out.print("*");
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
