package instrument;

public class MusicTest {
    public static void main(String[] args) {
        Tuneable grandPiano = new Piano("Grand Piano", 88);
        VolumeAdjustable altoSax = new Sax("Alto Sax", 23);




        grandPiano.detuneInstrument();
        detuneRetune(grandPiano);
        makeTwoStaccatoSounds(altoSax);

    }

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();

    }
}
