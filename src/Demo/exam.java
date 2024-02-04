package Demo;
import java.util.*;
public class exam {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7};
	int odd = 0,even = 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i] % 2 == 0)
		{
			even = even + 1;
		}
		else
		{
			odd = odd + 1;
		}
	}
	System.out.println("no of odd no is:"+odd);
	System.out.println("no of even no is:"+even);
	
}
}
