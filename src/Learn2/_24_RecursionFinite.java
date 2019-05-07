package Learn2;

public class _24_RecursionFinite {
	static int count=0;
	
	static void p(){  
		count++;  
		if(count<=5){  
			System.out.println("hello "+count);  
			p();  
		}  
	}  
	
	public static void main(String[] args) {  
	p();  
	}  
}
