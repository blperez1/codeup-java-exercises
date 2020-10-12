package instrument;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private int saxType;
    public Sax(String classification, int saxType) {
        super(classification);
        this.saxType = saxType;
    }

    public int getSaxType() {
        return saxType;
    }

    @Override
    public void startMusic() {
        System.out.println("Jazz");
    }

    @Override
    public void stopMusic() {
        System.out.println("You reed is squeeking! You suck!");
    }

    @Override
    public void volumeUp() {
        System.out.println("Crescendo");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decrescendo");
    }

    @Override 
    public void tuneInstrument() {
        System.out.println("You are off key. Tune!");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Standard tuning is overrated! Change key!");
    }


}
