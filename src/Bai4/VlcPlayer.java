package Bai4;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}
