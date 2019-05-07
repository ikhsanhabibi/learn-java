package Learn1;

public class _17_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default = string has null, primitive has zero
		
		int [] number;
		number = new int [5];
		number [0] = 5;
		System.out.println(number[0]);
		//change value from very last value
		number[0] = 10;
		System.out.println(number[0]);
	
	
	
		int [] newnumber = {1,2,3,4,5};
		System.out.println(newnumber[4]);
		
		
		int arr[ ][ ] = new int [1][2];
		arr [0][1]=10;
		System.out.println(arr [0][1]);
		System.out.println(arr [0][0]);
		String a ;
		
		String b = "aku";
		System.out.println(b.length());
	}
}
