public class App {
    public static void main(String[] args) throws Exception {
        BeatModelInterface model       = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
