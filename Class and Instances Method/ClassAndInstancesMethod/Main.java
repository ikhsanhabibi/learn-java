package ClassAndInstancesMethod;

public class Main {
	
	static void learn(){ //class method, static = possible to call without creating object
		System.out.println("You learn something");
	}

	public static void main(String[] args) {

		
		// to execute a non-static method, you must do this:

			Student h1 = new Student();//Create an instance, instantiating
			h1.learnJava();//Refer to the instance's class's code
		//	learnJava();
			System.out.println();
			
		//You can do this to execute a static method:
			learn();//Simply refers to the class's static code
			
			
	}
	
	
}

