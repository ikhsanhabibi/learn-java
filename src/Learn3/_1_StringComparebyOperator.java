package Learn3;

public class _1_StringComparebyOperator {

        public static void main(String args[]){  
          String s1="Ikhsan";  
          String s2="Ikhsan";  
          String s3=new String("Ikhsan");  
          System.out.println(s1==s2);//true (because both refer to same instance)  
          System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
        }  
       
}
