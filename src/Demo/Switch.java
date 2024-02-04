package Demo;
import java.util.*;

public class Switch {
	public static void main(String[] args) {
		int a,b;
		System.out.println("enter the values of a and b");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		char operator;
		System.out.println("enter the op + - / * %");
		operator = sc.next().charAt(0);
		switch(operator)
		{
		case '+':
				System.out.println("the output is "+(a+b));
				break;
		case '-':
			System.out.println("the output is "+(a-b));
			break;
		case '*':
			System.out.println("the output is "+(a*b));
			break;
		case '/':
			System.out.println("the output is "+(a/b));
			break;
		case '%':
			System.out.println("the output is "+(a%b));
			break;
		default:
			System.out.println("enter correct otp");
		
				
		}
		
		
	}

}
