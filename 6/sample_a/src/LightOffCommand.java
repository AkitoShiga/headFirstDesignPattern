public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    pugblic void execute() {
        light.off();
    }
}
