//Apisha Panchadssaram
public class CatListTester {
    public static void main(String[] args) {
        // Test the CatListHandler class
        // Instantiate a CatListHandler object
        CatListHandler obj = new CatListHandler();
        // Test every method in the class thoroughly
        // adding cats
        obj.addCat("Amy", "Abyssinian", 3);
        obj.addCat("Ivy", "Siberian cat", 7);
        obj.addCat("Sam", "Turkish Angora", 5);
        obj.addCat("Emily", "Russian Blue", 10);
        // removing a cat
        obj.removeCat("Amy");
        // getting all cats
        obj.getAllCats();
        // sorting cats by name alphabetically
        obj.sortCats();
        // sorting cats by age in descending order
        obj.sortCatsByAge();

    }
}