package Learn1;


public class _10_AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		a+=2;
		//a=a+2; we count from right
		System.out.println(a);
		
		//brackets important
		int b = 1;
		int c = 2;
		//with brackets
		b=(b*5)+(c/3);
		System.out.println(b);
		//without brackets
		b=b*5+c/3;
		System.out.println(b);
		
		
	}

}
