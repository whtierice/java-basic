package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer Ipod = new MusicPlayer();

        Ipod.on();

        Ipod.volumeUp();
        Ipod.volumeUp();
        Ipod.volumeDown();

        Ipod.status();

        Ipod.off();
    }
}
