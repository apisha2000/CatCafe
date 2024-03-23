//Apisha Panchadssaram
import java.util.Comparator;
import java.util.*;

public class Cat {
	// Cat class with three instance variable
	private String name;
	private String breed;
	private int age;

	// constructer to initialize the instance variable
	public Cat(String name, String breed, int age) {
		// this keyword is used for current instance
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	// setter method to set the name
	public void setName(String name) {
		this.name = name;
	}

	// getter method to return the name
	public String getName() {
		return name;
	}

	// setter method to set the breed
	public void setBreed(String breed) {
		this.breed = breed;
	}

	// getter method to return the breed
	public String getBreed() {
		return breed;
	}

	// setter method to set the breed
	public void setAge(int age) {
		this.age = age;
	}

	// getter method to return the age
	public int getAge() {
		return age;
	}

	public static Comparator<Cat> catNameComparator = new Comparator<Cat>() {

		// Comparing attributes of students
		public int compare(Cat c1, Cat c2) {
			String CatName1 = c1.getName().toUpperCase();
			String CatName2 = c2.getName().toUpperCase();

			// Returning in ascending order
			return CatName1.compareTo(CatName2);

		}
	};

	// Comparator for sorting the list by age
	public static Comparator<Cat> catAge = new Comparator<Cat>() {

		// Method
		public int compare(Cat c1, Cat c2) {

			int age1 = c1.getAge();
			int age2 = c2.getAge();

			// For descending order
			return age2 - age1;

		}
	};

	// Overriding toString() method to list out student details
	public String toString() {

		return "[Name = " + name + ", breed = "
				+ breed + ", age = " + age + "]";
	}
}
