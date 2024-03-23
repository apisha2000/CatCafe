
//Apisha Panchadssaram
import java.util.*;

class CatManager {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// constructer with no arguments
		CatListHandler objCLH = new CatListHandler();

		while (true) {
			// accessing the menu
			System.out.print("Main Menu: ");
			System.out.println(
					"\n 1. Add Cat \n 2. Remove Cat \n 3. Show All Cats \n 4. Show Number of Cats\n 5. Sort Cats \n 6. Sort Cats by Age ");

			int choice;
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				// adding the breed with appropriate String data type
				System.out.println("Add name");
				while (!sc.hasNext("[A-Za-z]*")) {
					System.out.println("That's not a String!");
					System.out.println("Add name");
					sc.nextLine();
				}
				String name = sc.nextLine();
				// adding the breed with appropriate String data type
				System.out.println("Add breed");
				while (!sc.hasNext("[A-Za-z]*")) {
					System.out.println("That's not a String!");
					System.out.println("Add breed");
					sc.nextLine();
				}
				String breed = sc.nextLine();
				// adding the age with appropriate int data type
				System.out.println("Add age ");
				while (!sc.hasNextInt()) {
					System.out.println("That's not a number!");
					System.out.println("Add age");
					sc.next();
				}
				int age = sc.nextInt();
				if (objCLH.addCat(name, breed, age))
					System.out.println("Successful to add cat");
				else
					System.out.println("Add failed");
			}
			// deletion of cat
			else if (choice == 2) {
				System.out.println("Input the name of the Cat they wish to delete");
				String name = sc.nextLine();
				if (objCLH.removeCat(name))
					System.out.println("Successful removal of cat");
				else
					System.out.println("Removal failed");

			}
			// calling the method to get all the cats
			else if (choice == 3)
				System.out.println(objCLH.getAllCats());
			// calling the method to get the cat count
			else if (choice == 4)
				System.out.println(objCLH.getCatCount());
			// sort list name wise
			else if (choice == 5) {
				if (objCLH.sortCats())
					System.out.println("Sorting is successful");
				else
					System.out.println("Sorting is failed");
				// sort list age wise
			} else if (choice == 6) {
				objCLH.sortCatsByAge();
			} else
				System.out.println("Wrong input");
		}
	}

}