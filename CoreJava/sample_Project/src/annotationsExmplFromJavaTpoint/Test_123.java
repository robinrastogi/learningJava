package annotationsExmplFromJavaTpoint;

class Animal {
	void eatSomething() {
		System.out.println("eating something");
	}  
}  
      
class Dog extends Animal {
	@Override
	void eatsomething() {							//should be eatSomething to override the method
		System.out.println("eating foods");
    }

//	@Override
//    void eatSomedhdfghfgthing() {							//now correct !! :)
//		System.out.println("eating foods");
//    }  
	
}  
      
public class Test_123 {
	public static void main(String args[]) {
		Animal a=new Dog();
		a.eatSomething();
	}
}  