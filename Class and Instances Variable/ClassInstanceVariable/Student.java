package ClassInstanceVariable;

public class Student {

	 int id;		//field or class variable  
	 String name;  
	  
	 public static void main(String args[]){  
	  Student s1=new Student();	//creating an object of Student  
	  System.out.println(s1.id);	//accessing member through reference variable  
	  System.out.println(s1.name);  
	 }  

}
