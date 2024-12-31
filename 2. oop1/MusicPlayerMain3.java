package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        MusicPlayerData Ipod = new MusicPlayerData();

        powerOn(Ipod);

        volumeUp(Ipod);

        volumeUp(Ipod);

        volumeDown(Ipod);

        status(Ipod);

        powerOff(Ipod);
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악플레이어 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악플레이어 볼륨: " + data.volume);
    }

    static void powerOn(MusicPlayerData data) {
        data.ison = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void powerOff(MusicPlayerData data) {
        data.ison = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void status(MusicPlayerData data) {

        System.out.println("음악 플레이어 상태 확인");
        if (data.ison == true) {
            System.out.println("음악 플레이어: ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어: OFF");
        }

    }

}
