public class Drum implements Instrument{
    int diameter;

    public Drum(int diameter){
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играем на барабане с диаметром = " + diameter);
    }
}
