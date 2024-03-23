
//Apisha Panchadssaram
import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class CatListHandler {
	ArrayList<Cat> list = new ArrayList<Cat>();

	// default constructor
	public CatListHandler() {
	}

	// constructor takes array of cat objects
	public CatListHandler(Cat obj[]) {
		for (int i = 0; i < obj.length; i++)
			list.add(obj[i]);
	}

	// adding a cat
	public boolean addCat(String catName, String bread, int age) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(catName))
				return false;

		}
		Cat c = new Cat(catName, bread, age);
		// newly created cat object is added in arraylist
		list.add(c);
		return true;

	}

	// removal of a cat
	public boolean removeCat(String catName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(catName)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}

	// getting all the cats
	public String getAllCats() {
		String allCats = "";
		for (Cat c : list) {
			// toString can be used.
			allCats += c.toString();
		}
		return allCats;
	}

	// getting the count of cats
	public String getCatCount() {
		return ("Number of cats are: " + list.size());
	}

	// returning true or false
	public boolean sortCats() {

		// name wise sorting
		System.out.println("Sorting cats name wise:");
		Collections.sort(list, Cat.catNameComparator);

		for (Cat str : list) {
			// toString method will be called
			System.out.println(str);
		}
		return true;
	}

	public void sortCatsByAge() {
		// Now, sorting on age property
		System.out.println("Sorting cats by age:");

		Collections.sort(list, Cat.catAge);

		// Iterating over list via for each and printing the elements
		for (Cat str : list) {
			// toString method will be called
			System.out.println(str);
		}

	}
}