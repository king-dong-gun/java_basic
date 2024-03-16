package oop01;

public class MusicPlayer {
    int volume;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("뮤직 플레이어를 시작합니다.");
    }
    void off() {
        System.out.println("뮤직 플레이어를 종료합니다.");
    }
    void volumeUp() {
        volume++;
        System.out.println("볼륨 증가 >> " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("볼륨 감소 >> " + volume);
    }
    void setStatus() {
        System.out.println("--플레이어 상태 확인--");
        if(isOn) {
            System.out.println("전원이 켜져있습니다. 현재 볼륨 >> " + volume);
        } else  {
            System.out.println("전원이 꺼져있습니다.");
        }
        System.out.println("------------------");
    }
}
