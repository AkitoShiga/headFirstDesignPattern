public abstract class Beverage {
    public String description;

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}

class HouseBlend extends Beverage {
    public double cost() {
        return 1;
    }
}

class DarkRoast extends Beverage {
    public double cost() {
        return 2;
    }
}

class Decaf extends Beverage {
    public double cost() {
        return 3;
    }
}

class Espresso extends Beverage {
    public double cost() {
        return 4;
    }
}
/**
 * 知力
 * この設計は、設計原則のどの部分に反しているか
 * 変更する部分が分離されていない
 * コスト、トッピング
 * インターフェースを使用していない
 * コンポジションを使用していない
 * */

public abstract class Beverage {
    public String description;
    public boolean milk;
    public boolean soy;
    public boolean mocha;
    public boolean whip;

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public boolean hasMilk() {
        return milk;
    };
    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    };
    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    };
    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    };
    public void setWhip(boolean whip) {
        this.whip = whip;
    }

}

public class class Beverage {
   public String description = "最高級ダークロースト";
   public double cost() {

   }
   public DarkRoast() {

   }

}
