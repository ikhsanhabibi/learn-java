package Learn0;

public class _5_TypeCasting {
	    public static void main(String[] args)
	    {
	    		//Widening or Implicit
	    	      int i = 100;	
	    	      long l = i;	//no explicit type casting required  
	    	      float f = l;	//no explicit type casting required  
	    	      System.out.println("Int value "+i);
	    	      System.out.println("Long value "+l);
	    	      System.out.println("Float value "+f);
	    	      
	    	      //Narrowing or Explicit
//	    	        double d = 100.04;  
//  	            long l = (long)d;  //explicit type casting required  
//  	            int i = (int)l;	//explicit type casting required  
//  	            
//  	            System.out.println("Double value "+d);
//  	            System.out.println("Long value "+l);
//  	            System.out.println("Int value "+i);       
	    	      
	    	      double numb =3.14;
	    	      int newnumb = (int)numb;
	    	      System.out.println(newnumb);
	    	      
	    	      
	    	      int a=10, b=3;
	    	      double neww= a/b;
	    	      System.out.println("hier "+neww);
	    	      
//	    	      boolean hey = true;
//	    	      char hello = (char)hey;
	    	        
	    }
	    	       
	    public void add() {
	    	
	    }

}
