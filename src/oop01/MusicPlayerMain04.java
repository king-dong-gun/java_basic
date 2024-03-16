package oop01;

public class MusicPlayerMain04 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        // 전원 켜기
        musicPlayer.on();
        // 볼륨 증가
        musicPlayer.volumeUp();
        // 볼륨 증가
        musicPlayer.volumeUp();
        //볼륨 감소
        musicPlayer.volumeDown();
        // 플레이어 상태 확인
        musicPlayer.setStatus();
        // 전원 끄기
        musicPlayer.off();

    }
}
