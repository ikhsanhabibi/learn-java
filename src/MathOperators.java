
public class MathOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double phi = Math.PI;
		double e = Math.E;
		System.out.println(phi);
		System.out.println(e);
		
		int betrag = Math.abs(-10);
		System.out.println(betrag);
		
		double square = Math.sqrt(4);
		System.out.println(square);
		
		double pow = Math.pow(2, 3);
		System.out.println(pow);
		
		System.out.println("random");
		double random = Math.random()*10+1;
		int newrandom=(int)random;
		System.out.println(newrandom);
		
		randomWithRange(1, 5);
	}
	
		public static void randomWithRange(int min, int max){
			int range = (max - min) + 1;     
			  int randomnumber = (int)(Math.random() * range) + min;
			  System.out.println(randomnumber);
			   
			
			
		}
		

}
