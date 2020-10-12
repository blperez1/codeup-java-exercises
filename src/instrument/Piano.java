package instrument;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable{
    private int numberOfKeys;

    public Piano(String classification, int keys){
        super(classification);
        this.numberOfKeys = keys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public void startMusic() {
        System.out.println("Fur Elise");
    }

    @Override
    public void stopMusic() {
        System.out.println("You sound tired...Take a break...");
    }

    @Override
    public void volumeUp() {
        System.out.println("Play Forte");
    }

    @Override
    public void volumeDown() {
        System.out.println("Play Piano");
    }

}
