package TestToString;
class Dog{
	public String toString(){
		return "Dog";
	}
}
public class TestToString{
	public static void main(String[] args){
		Dog dog = new Dog();
		System.out.println("dog = "+dog);
		System.out.println("dog = "+dog.toString());
	}
}