package Learn3;

public class _0_StringEquals {

        public static void main(String args[]){  
          String s1="Ikhsan";  
          String s2="Ikhsan";  
          String s3=new String("Ikhsan");  
          String s4="Habibi";  
          System.out.println(s1.equals(s2));//true  
          System.out.println(s1.equals(s3));//true  
          System.out.println(s1.equals(s4));//false  
        }  

}
