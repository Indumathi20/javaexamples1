package Demo;
import java.util.*;

public class examp {
public static void main(String[] args) 
{
	int arr[] = {10, 40, 50, 20, 10, 20, 30, 10};
	int n=arr.length;
	countfreq(arr,n);
	
}

private static void countfreq(int[] arr, int n) {
	HashMap<Integer,Integer> hash = new HashMap<>();
	for(int i = 0;i < n;i++)
	{
		if(hash.containsKey(arr[i]))
		{
			hash.put(arr[i],hash.get(arr[i])+1);
		}
		else
		{
			hash.put(arr[i],1);
		}
	}

	for(Map.Entry<Integer, Integer> en: hash.entrySet())
	{
		if(en.getValue() == 1)
		{
			System.out.println(en.getKey());
		}
	}
}
}
