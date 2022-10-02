public class Main {
    public static void main(String[] args) {
        Printable magazine = new Magazine();
        Printable book = new Book();

        Printable[] printables = {magazine, book};

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}