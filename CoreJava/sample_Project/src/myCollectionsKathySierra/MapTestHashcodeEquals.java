package myCollectionsKathySierra;

import java.util.*;

/**
 * 
 * @author Robin
 *
 */

//Dog class
class Dog {
	public Dog (String n) {
		name=n;
	}
	
	public String name;
	
	//equals
	public boolean equals (Object o) {
		if ((o instanceof Dog) && (((Dog)o).name==name)) {
			System.out.println("inside equals");
			return true;
		}
		else {
			System.out.println("inside equals");
			return false;
		}
	}
	
	//hashcode
	public int hashcode() {
		System.out.println("inside hashcode => " + name.length());
		return name.length();
	}
	
}

//Cat class
class Cat {
	
}

//Pets enumeration
enum Pets { Dog, CAT, HORSE }

public class MapTestHashcodeEquals {
	public static void main (String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new Dog("aiko"));
		m.put("k2", Pets.Dog);
		m.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover");
		m.put(d1, "Dog key");
		m.put (new Cat(), "Cat key");
		
		System.out.println(m.get("k1"));
		String k2 = "k2";
		System.out.println(m.get(k2));
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
		
		d1.name = "magnolia";
		System.out.println(m.get(d1));
//		System.out.println(m);
	}
}
