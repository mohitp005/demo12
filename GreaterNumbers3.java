//wap to check greater number among three numbers

package Pack3;

import java.util.Scanner;

public class GreaterNumbers3 {

	public static void main(String[] args) {
		int num1,num2,num3;
		
		System.out.println("Enter three numbers : ");
		Scanner g=new Scanner(System.in);
		num1=g.nextInt();
		num2=g.nextInt();
		num3=g.nextInt();
		
		if((num1>num2) && (num1>num3))
			System.out.println("Num1 is greater");
		else if((num2>num1) && (num2>num3))
			System.out.println("Num2 is greater");
		else
			System.out.println("Num3 is greater");
			
	}

}
