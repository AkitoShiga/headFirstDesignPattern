Pizza orderPizza(){

    Pizza pizza = new Pizza();

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
}

/**
 *  適切なピザの種類を判別して、ピザを作成する
 */

pizza orderpizza(string type){

    pizza pizza;

    if(type.equals("チーズ")) {
        pizza = new cheesepizza();
    } else if(type.equals("ギリシャ")) {
        pizza = new greekpizza();
    } else if(type.equals("ペパロニ")) {
        pizza = new pepperonipizza();
    }

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
}

/**
 * 競合他社が流行のピザをメニューに追加していることが判明
 * ギリシャピザが売れていないので、メニューから削除
 */
pizza orderpizza(string type){

    pizza pizza;
    // 変更になる
    if(type.equals("チーズ")) {
        pizza = new CheesePizza();
    } else if(type.equals("ペパロニ")) {
        pizza = new PepperoniPizza();
    } else if(type.equals("クラム")) {
        pizza = new ClamPizza();
    } else if(type.equals("野菜")) {
        pizza = new VeggiPizza();
    }
    // 変更になる

    // 変更しない
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    // 変更しない

    return pizza;
}
/* 変更に対して閉じていないよなあ？ */

/* こうしてえよなあ？ */
pizza orderpizza(string type){

    pizza pizza;

    // してえよなあ？？
    pizza = createPizza(type);// Pizza作成インターフェース

    // 変更しない
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    // 変更しない

    return pizza;
}

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("チーズ")) {
            pizza = new CheesePizza();
        } else if(type.equals("ペパロニ")) {
            pizza = new PepperoniPizza();
        } else if(type.equals("クラム")) {
            pizza = new ClamPizza();
        } else if(type.equals("野菜")) {
            pizza = new VeggiPizza();
        }

        return pizza;

    }
}

/* 改良版 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza  orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

/**
 * この度PizzaStoreがフランチャイズ展開することになった
 * フランチャイズ店には実績のあるコードを使ってもらいたいが、
 * 地域ごとの特性の違いはどうしよう？
 * だってご当地ピザを提供したいもんなあ？？？
 *
 */

 /* 案：ご当地ごとのPizzaFactoryを実装する*/
NyPizzaFactory nyFactory = NYPizzaFactory();
PizzaStore nyStore = new PizzaStore(nyFactory);
nyStore.orderPizza("野菜");

ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
PizzaStore chicagoStore = new PizzaStore(chicagoPizzaFactory);

 /* 案：createPizzaを抽象メソッドにする */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    abstract Pizza createPizza(String type);
}
