package CallByValueAndReference;



public class Main {

	 static void plusOne(int oldnumber) { //static = possible to use without creating an object
		oldnumber = oldnumber +1;
		
	}
	
	static void plusOne (Student name){ //static = possible to use without creating an object
		name.matrikelnumber = 10000;
	}
	
	public static void main(String[] args) {
		// call by value
		int oldnumber = 11110;
		plusOne(oldnumber);
		System.out.println("Oldnumber: "+oldnumber);
		
		//call by reference
		Student student1 = new Student(12345);
		System.out.println("Matrikelnumber Student1 is:"+ student1.matrikelnumber);
	
		plusOne(student1);
		System.out.println("Matrikelnumber Student1 is:"+ student1.matrikelnumber);
		
		
		
	}

	

}
