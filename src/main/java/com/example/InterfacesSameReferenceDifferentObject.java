public interface Playable {
    void play();
}

public interface Recordable {
    void record();
}

public class MediaDevice implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Playing media...");
    }

    @Override
    public void record() {
        System.out.println("Recording media...");
    }
}

public class Main {
    public static void main(String[] args) {
        MediaDevice mediaDevice = new MediaDevice();

        Playable playable = mediaDevice;
        playable.play(); // Outputs: Playing media...

        Recordable recordable = mediaDevice;
        recordable.record(); // Outputs: Recording media...
    }
}
