package instrument;

public class MusicTest {
    public static void main(String[] args) {
       Piano grandPiano = new Piano("Grand Piano", 88);
        Sax altoSax = new Sax("Alto Sax", 23);

        VolumeAdjustable adjustableGrandPiano = grandPiano;
        Tuneable tuneableGrandPiano = grandPiano;

        VolumeAdjustable adjustableAltoSax = altoSax;
        Tuneable tuneableAltoSax = altoSax;
        
        detuneRetune(tuneableAltoSax);
        makeTwoStaccatoSounds(adjustableAltoSax);
        detuneRetune(tuneableGrandPiano);
        makeTwoStaccatoSounds(adjustableGrandPiano);

        // VolumeAdjustable adj;
        // Tuneable tune;

        // adj = grandPiano;
        // tune = grandPiano;

        // detuneRetune(tune);
        // makeTwoStaccatoSounds(adj);

        // adj = altoSax;
        // tune = altoSax;

        // detuneRetune(tune);
        // makeTwoStaccatoSounds(adj);


    

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
