public class Magazine implements Printable{
    @Override
    public void print() {
        System.out.println("Текст журнала");
    }

    public static void printMagazines(Printable[] printable){
        for (Printable magazine : printable){
            if (magazine instanceof Magazine){
                magazine.print();
            }
        }
    }
}