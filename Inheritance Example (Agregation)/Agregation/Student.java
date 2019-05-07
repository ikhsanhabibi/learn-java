package Agregation;

public class Student {  
    int id;  
    String name;  
    Address address;  
      
    public Student(int id, String name,Address address) {  
        this.id = id;  
        this.name = name;  
        this.address=address;  
    }  
      
    void display(){  
    System.out.println("ID: "+id+" Name: "+name+ " Address: "+ address.city+ ", " +address.country);  
    System.out.println();  
    }  
      
    public static void main(String[] args) {  
    Address address1=new Address("Berlin", "Germany");  
    Address address2=new Address("Jakarta", "Indonesia");  
      
    Student student1=new Student(111,"Julia",address1);  
    Student student2=new Student(222,"Habibi",address2);  
          
    student1.display();
    student2.display();  
          
    }  
    }  