package cn.ning.pattern.structural.adapter;

/**
 * Lightning转3.5mm耳机转接头，适配器类。(类适配模式)
 */
public class LightningToEarphone extends Earphone implements AudioPlayer {
    @Override
    public void play() {
        playAudio();
    }
}
