public class Main {
    public static void main(String[] args) {

        // Crear dos autores
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Author paulTan = new Author("Paul Tan", "paul@somewhere.com", 'm');

        System.out.println(ahTeck);
        System.out.println(paulTan);

        // Crear array con DOS autores
        Author[] authorArray1 = new Author[2];
        authorArray1[0] = ahTeck;
        authorArray1[1] = paulTan;

        // Crear libro con dos autores
        Book dummyBook = new Book("Java for dummy", authorArray1, 19.95, 99);
        System.out.println(dummyBook);

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);

        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());

        // Ahora sí salen los DOS nombres
        System.out.println("Authors are: " + dummyBook.getAuthorNames());

        // Acceso individual
        System.out.println("First author's name: " + dummyBook.getAuthors()[0].getName());
        System.out.println("Second author's name: " + dummyBook.getAuthors()[1].getName());
    }
}