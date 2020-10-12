package instrument;

public abstract class MusicalInstrument implements Playable {
    private String instrumentClassification;

    public MusicalInstrument(String classification) {
        this.instrumentClassification = classification;
    }

    public void setClassification(String classification) {
        this.instrumentClassification = classification;
    }

    public String getClassification() {
        return instrumentClassification;
    }
}
