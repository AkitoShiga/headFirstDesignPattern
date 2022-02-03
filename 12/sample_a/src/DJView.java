public class DJView implements ActionListener, BeatObserver, BPMovserver {
    BeatModelInterface model;
    ControllerInterface controller;
    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;

    public DJView(ControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;
        model.registerObserver((BeatObserver)this);
        model.registerObserver((BPMObserver)this);
    }

    public void createView() {}
    public void updateBPM() {
        int bpm = model.getBPM();
        if(bpm == 0) {
            bpmOutputLabel.setText("オフライン");
        } else {
            bpmOutputLabel.setText("現行のBPM：" + model.getBPM());
        }
    }
    public void updateBeat() {
        beatBar.setValue(100);
    }

}
