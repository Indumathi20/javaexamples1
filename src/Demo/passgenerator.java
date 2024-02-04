package Demo;
import java.util.*;
public class passgenerator {
public static void main(String[] args) {
	String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lower = "abcdefghijklmnopqrstuvwxyz";
	String num = "0123456789";
	String specialChars ="@#$&*!%+-";
	String combination = upper + lower + specialChars + num;
	System.out.println("Enter the preferred length of the password");
	Scanner sc = new Scanner(System.in);
	int len = sc.nextInt();
	Random r = new Random();
	char[] password = new char[len];
	for(int i=0;i<len;i++)
	{
		password[i] = combination.charAt(r.nextInt(combination.length()));
		
	}
	System.out.println("Generated Password is:" + new String(password));
	
}
}
