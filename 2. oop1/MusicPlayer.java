package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean ison = false;

    void on() {
        ison = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        ison = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("현재 음량: " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("현재 음량: " + volume);
    }

    void status() {
        System.out.println("현재 음악 플레이어 상태");

        if (ison == true) {
            System.out.println("음악 플레이어 ON, 현재 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
