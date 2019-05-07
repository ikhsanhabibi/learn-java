package Learn0;

public class _4_Variables {

	public static void main(String[] args) {
		boolean test = true; //1bit
		byte bytesnumber = 128-1; //8bit
		short shortnumber = 1234; //16bit
		char chars = 'a'; //single character
		int integer = 1234567891; //32bit
		long longnumber = 123456789123456789L;//64bit
		double doublenumber = 3.14444444444444444444444d; //64bit bis 16digit
		float floatnumber = 3.144444444444444444444444444444f; //32bit bis 7digit
		System.out.println(floatnumber);
		System.out.println(doublenumber);
		
		 char[] newstring = {'a','b','c','d'};
		 String str = new String(newstring);
		 System.out.println(str);
	}
}
