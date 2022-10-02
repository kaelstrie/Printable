public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Текст книги");
    }

    public static void printBooks(Printable[] printable){
        for (Printable book : printable){
            if (book instanceof Book){
                book.print();
            }
        }
    }
}