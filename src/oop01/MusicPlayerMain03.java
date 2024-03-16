package oop01;

public class MusicPlayerMain03 {
    public static void main(String[] args) {

        MusicPlayerData musicPlayerData = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(musicPlayerData);

        // 볼륨 증가
        volumeUp(musicPlayerData);

        // 볼륨 증가
        volumeUp(musicPlayerData);

        // 볼륨 감소
        volumeDown(musicPlayerData);

        // 음악 플레이어 상태
        showStatus(musicPlayerData);

        // 음악 플레이어 끄기
        off(musicPlayerData);
    }

    static void on(MusicPlayerData musicPlayerData) { // 음악 플레이어 전원을 켜는 메소드
        musicPlayerData.isOn = true;
        System.out.println("음악을 플레이 합니다.");
    }

    static void off(MusicPlayerData musicPlayerData) { // 음악 플레이어 전원을 끄는 메소드
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다..");
    }

    static void volumeUp(MusicPlayerData musicPlayerData) { // 볼륨을 증가하는 메소드
        musicPlayerData.volume++;
        System.out.println("볼륨 증가 >> " + musicPlayerData.volume);
    }

    static void volumeDown(MusicPlayerData musicPlayerData) { // 볼륨을 감소하는 메소드
        musicPlayerData.volume--;
        System.out.println("볼륨 감소 >> " + musicPlayerData.volume);
    }
    static void showStatus(MusicPlayerData musicPlayerData) { // 플레이어 상태를 확인하는 메소드
        System.out.println("음악 플레이어 상태를 확인합니다.");
        if (musicPlayerData.isOn) {  // 플레이어가 켜져있다면
            System.out.println("플레이어가 재생중입니다. 현재 볼륨 >> " + musicPlayerData.volume);
        } else {  // 플레이어가 꺼져있다면
            System.out.println("플레이어가 재생중이 아닙니다.");
        }
    }
}
