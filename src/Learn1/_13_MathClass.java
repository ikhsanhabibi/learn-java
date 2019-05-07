package Learn1;
public class _13_MathClass {

	public static void main(String[] args) {
		
	
	int abs = Math.abs(-20); // abs = 20
	System.out.println(abs);
	
	int min = Math.min(10, 20);
	System.out.println(min);
	
	int max = Math.max(10, 20);
	System.out.println(max);
	
	double random = Math.random(); //0 to 1
	System.out.println(random);
	
//	System.out.println("random");
//	double random = Math.random()*10+1;
//	int newrandom=(int)random;
//	System.out.println(newrandom);
	
	
	double exp1 = Math.exp(1);
	System.out.println("exp = " + exp1);
	
	double log1  = Math.log(8);
	System.out.println("log1 = " + log1);
	
	double log2  = Math.log10(100);
	System.out.println("log2 = " + log2);
	
	double pow2 = Math.pow(2,2);
	System.out.println("pow2 = " + pow2);
	
	double sqrt4 = Math.sqrt(4);
	System.out.println("sqrt4 = " + sqrt4);
	
	System.out.println(Math.PI);
	
	//in radians
	double sin = Math.sin(Math.toRadians(270));
	System.out.println("sin = " + sin);
	
	double cos = Math.cos(Math.PI);
	System.out.println("cos = " + cos);

	
	double radians = Math.toRadians(180);
	System.out.println("radians = " + radians);

	
	}

}
