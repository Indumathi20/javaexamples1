package Demo;
import java.util.*;
public class Input_from_user {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a integer");
	int no = sc.nextInt();//for int
	System.out.println(no);
	
	System.out.println("enter a double integer");
	double no1 = sc.nextDouble();
	System.out.println(no1);
	
	sc.nextLine();//this is put so that the enter keyword is not defaultly taken as a string
	
	System.out.println("enter a string");
	String name = sc.nextLine();//takes the whole sentence also
	System.out.println(name);
	
	System.out.println("enter a word");
	String name1 = sc.next();
	System.out.println(name1);
	//sc.nextByte();
	//sc.nextShort();
	//sc.nextLong();
	//sc.nextBoolean();
	//sc.nextFloat();
}
}
