package selfLearning;
class Animal{
	String color;
	int age;

	
	  public void run() { System.out.println("i am running"); } public void bark()
	  { System.out.println("i am barking"); } //void display(String color,int age){
	  //color=color;age=age; System.out.println(color+"- color; age- "+age); }
	 
	/*
	 * Animal(String s,int a){ this.color=s; this.age=a;
	 * System.out.println(color+"- color; age- "+age); }
	 */

}
class Dog extends Animal{
     
	}

public class Self {
                 
	public static void main(String[] args) {
		Animal dog=new Animal();
		System.out.println("dog");
		dog.run();
	  dog.bark();
		//dog.display("black",12);
	  System.out.println(dog.color+"1");
	  System.out.println("-------------------------------------");
		Animal cat=new Animal();
		System.out.println("cat");
	
		 cat.run(); cat.bark(); //cat.display("brown",6);
		 
		System.out.println("-------------------------------------");
		Dog dog1=new Dog();
		dog1.run();
		Animal bird=new Dog();
		bird.bark();
		
		

	}

}
