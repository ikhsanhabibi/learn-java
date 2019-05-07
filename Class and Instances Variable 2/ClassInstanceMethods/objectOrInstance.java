package ClassInstanceMethods;

import ClassInstanceMethods.Student;

public class objectOrInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student(); //allocate/create memory(menyediakan)
		student1.introduction();
		System.out.println(student1);
		
		System.out.println();
		
		student1 = new Student("Habibi",25); //fill memory
		System.out.println("Student1 name: "+student1.name);
		System.out.println("Student1 id: "+student1.idnumber);
		System.out.println("Total Student: "+Student.totalStudent);
		
		System.out.println();
		
		Student student2 = new Student("Ikhsan",20);
		System.out.println("Student2 name: "+student2.name);
		System.out.println("Student2 id: "+student2.idnumber);
		System.out.println("Total Student: "+Student.totalStudent);
		
		//getName(); we need object to call the methods
		hello();
	}
	
	public static void hello() {
		System.out.println("Hi i am class method");
	}

}
