package ClassInstanceVariable;


class Students {
        int id;  
        String name;  
       }  


public class Main{  
        public static void main(String args[]){  
         Students s1=new Students();
         Students s2=new Students();
         
         s1.name ="a";
         s1.id=1111;
         
         System.out.println(s1.id);
         System.out.println(s1.name);  
         
         System.out.println(s1.id);
         System.out.println(s1.name); 
        }  
}
