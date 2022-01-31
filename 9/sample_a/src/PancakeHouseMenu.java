import java.util.*;
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem(
            "K&Bのパンケーキ朝食"
            ,"スクランブルエッグとトーストがついたパンケーキ"
            ,true
            ,2.99);

        addItem(
            "通常のパンケーキ朝食"
            ,"卵焼きとソーセージがついたパンケーキ"
            ,false
            ,2.99);

        addItem(
            "ブルーベリーパンケーキ"
            ,"新鮮なブルーベリーで作ったパンケーキ"
            ,true
            ,3.49);

        addItem(
            "ワッフル"
            ,"ブルーベリーかいちごの好きな方を載せたワッフル"
            ,true
            ,3.59);
    }
    public void addItem(
        String name
        ,String description
        ,boolean vegetarian
        ,double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, prive);
        MenuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
