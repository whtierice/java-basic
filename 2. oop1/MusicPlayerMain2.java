package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData Ipod = new MusicPlayerData();

        Ipod.ison = true;
        System.out.println("음악 플레이어를 시작합니다.");

        Ipod.volume++;
        System.out.println("음악 플레이어 볼륨: " + Ipod.volume);

        Ipod.volume++;
        System.out.println("음악 플레이어 볼륨: " + Ipod.volume);

        Ipod.volume--;
        System.out.println("음악 플레이어 볼륨: " + Ipod.volume);

        System.out.println("음악 플레이어 상태 확인");

        if (Ipod.ison == true) {
            System.out.println("음악 플레이어: ON, 볼륨 : " + Ipod.volume);
        } else {
            System.out.println("음악 플레이어: OFF");
        }

        Ipod.ison = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
