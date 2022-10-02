public class Guitar implements Instrument{
        int numberofstrings;

    public Guitar(int numberofstrings){
        this.numberofstrings = numberofstrings;
    }

    @Override
    public void play() {
        System.out.println("Играем на гитаре с количеством струн = " + numberofstrings);
    }
}