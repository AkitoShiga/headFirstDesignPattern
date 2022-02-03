public class BeatModel implements BeatModelInterface, MetaEventListerner {
    void initialize(){
        setUpMidi();
        buildTrackAndStart();
    }

    void on(){
        sequencer.start();
        setBPM(90);
        sequencer.start();
    }
    void off() {
        setBPM(0);
        sequencer.stop();
    }
    void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        // 状態の変化を通知する
        notifyBPMObservers();
    }
    int getBPM() {
        return bpm;
    }
    void beatEvent() {
        notifyBeatObservers();
    }

    void registerObserver(BeatObserver o) {}
    void removeObserver(BeatObserver o) {}
    void registerObserver(BPMObserver o) {}
    void removeObserver(BPMObserver o) {}
}
