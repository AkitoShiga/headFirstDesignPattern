import java.util.*;
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "シカゴスタイルのディープディッシュピザ";
        dough = "極厚クラスト生地";
        sauce = "プラムトマトチーズ";
        toppings.add("刻んだモッツァレラチーズ");
    }
    void cut() {
        System.out.println("ピザを四角形に切り分ける");
    }

}
