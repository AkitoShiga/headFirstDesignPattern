public class ModelDuck extends Duck {
    public ModelDuck() {
        // 模型の鴨は飛ぶ手段を持たず、地上で生活をはじめます。
        flyBehavior   = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("模型の鴨です");
    }
}
