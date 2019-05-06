package cn.ning.pattern.structural.adapter;

/**
 * IphoneX手机，客户类。
 */
public class IPhoneX {
    private AudioPlayer audioPlayer;

    public void setAudioPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
    public void playMusic() {
        if (this.audioPlayer != null) {
            System.out.println("IPhoneX准备播放音乐...");
            audioPlayer.play();
        }
    }
}
