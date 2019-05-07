package SuperKeywordRealUse;

class Person{  
	int id;  
	String name;  
	//constructor
	Person(int id,String name){  
	this.id=id;  
	this.name=name;  
	}  
}  

class Emp extends Person{  
	float salary;  
	//constructor
	Emp(int id,String name,float salary){  
	super(id,name);//!!super used, reusing parent constructor  
	this.salary=salary;  
	}  

	void display(){
		System.out.println(id+" "+name+" "+salary);
		}  
}

class TestSuper4{  
	public static void main(String[] args){  
	Emp e1=new Emp(1,"ankit",45000f);  
	e1.display();  
	}
} 