package ClassInstanceMethods;

public class Student {

		public String name; //instance/object variable
		int idnumber;
		public static int totalStudent; //static, class variable, shares variable for all created objects

		//constructor with parameter to initialize
		public Student(String name, int idnumber) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.setIdnumber(idnumber);
			totalStudent++;
		}
		
		//default constructor, no parameters, has the same name with classname, has value null/zero
		public Student() {
			// TODO Auto-generated constructor stub
		}

		public void introduction() {
			System.out.println("Hello my name is " + getName());
		}

		//Getter and Setter Method
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIdnumber() {
			return idnumber;
		}

		public void setIdnumber(int idnumber) {
			this.idnumber = idnumber;
		}

}
