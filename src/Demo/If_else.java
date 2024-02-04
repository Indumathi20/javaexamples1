package Demo;
import java.util.*;

public class If_else {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num > 0)
			System.out.println(num+ "is positive");
		else
			System.out.println(num + "is negative");
	}

}
