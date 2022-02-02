public class Quackologist implements Observer {
    pulicvoid update(QuackObservable duck) {
        System.out.println("鴨の鳴き声学者：" + duck + "が鳴きました");
    }
}
