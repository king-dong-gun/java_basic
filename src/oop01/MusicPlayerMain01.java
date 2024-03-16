package oop01;

public class MusicPlayerMain01 {
    public static void main(String[] args) {

        // 절차 지향 프로그래밍
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악을 플레이 합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("볼륨 증가 >> " + volume);

        // 볼륨 증가
        volume++;
        System.out.println("볼륨 증가 >> " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("볼륨 감소 >> " + volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태를 확인합니다.");
        if (isOn) {
            System.out.println("플레이어가 재생중입니다. 현재 볼륨 >> " + volume);
        } else {
            System.out.println("플레이어가 재생중이 아닙니다.");
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
