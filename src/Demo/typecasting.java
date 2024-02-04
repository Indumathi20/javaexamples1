package Demo;

public class typecasting {
	//from one datatype to other
	/*
	 * widening casting (small to big)
	 * byte to short to char to int to long to float to double
	 * 
	 * narrowing casting
	 * big to small
	 * double to float to long to int to char to short to byte
	 * 
	 * */
	
	public static void main(String[] args) {
		int a = 10;
		double b = a,d = 25.6754;
		System.out.println(b);
		
		int c = (int)d;
		System.out.println("d "+ d);
		System.out.println("c "+c);
		
		
	}

}
