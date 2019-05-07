

public class Dog extends Animal {

	Dog(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {
		Dog d = new Dog("Bucky");
		System.out.println(d.name);
		d.move();
	}

}
