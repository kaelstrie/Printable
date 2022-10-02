public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(7);
        Drum drum = new Drum(50);
        Trumpet trumpet = new Trumpet(15);

        guitar.play();
        drum.play();
        trumpet.play();
    }
}

