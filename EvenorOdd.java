//wap to check is number is even or odd.

package Pack3;
import java.util.*;
public class EvenorOdd {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter a Number: ");
		
		Scanner eo=new Scanner(System.in);
		num=eo.nextInt();
		
		if(num%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");

	}

}
