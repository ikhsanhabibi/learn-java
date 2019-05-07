package Learn2;

public class _22_Varrags {
	
//	void method(String... a, int... b){} Compile time error  
//	void method(int... a, String b){} 	Compile time error  
	
	static void display(int num, String... values){  
		  System.out.println("number is "+num);  
		  for(String s:values){  
		   System.out.println(s);  
		  }  
		 }  
		  
	
	public static void main(String args[]){  
		  
		 display(500,"hello");//one argument   
		 display(1000,"my","name","is","varargs");//four arguments  
		 
		 }   

}
