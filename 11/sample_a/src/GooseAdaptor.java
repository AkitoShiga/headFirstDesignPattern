public class GooseAdaptor implements Quackable {
    Goose goose;
    public GooseAdaptor(Goose goose) {
        this.goose = goose;
    }
    public void quack() {
        goose.honk();
    }
}
