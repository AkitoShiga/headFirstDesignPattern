public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        public DinerMenu {
        addItem(
            "ベジタリアンBLT"
            ,"レタス、トマト、（偽）ベーコンを挟んだ全粒粉パンサンドイッチ"
            ,true
            ,2.99);

        addItem(
            "BLT"
            ,"レタス、トマト、ベーコンを挟んだ全粒粉パンサンドイッチ"
            ,false
            ,2.99);

        addItem(
            "本日のスープ"
            ,"ポテトサラダを添えた本日のスープ"
            ,false
            ,2.99);

        addItem(
            "Hotdog"
            ,"ザワークラウト、レリッシュ、玉ねぎ、チーズをはさんだホットドック"
            ,true
            ,2.99);
        }
        public void addItem(
             String name
            ,String description
            ,boolean vegetarian
            ,double price)
        {
            MenuItem menuItem = new MenuItem(
                 String name
                ,String description
                ,boolean vegetarian
                ,double price);

            if(numberOfItems >= MAX_ITEMS) {
                System.err.println("メニューはいっぱいです");
            } else {
                menuItems[numberOfItems] = menuItem;
                numberOfItems++;
            }
        }

        public MenuItems[] getMenuItems() { return menuItems; }
    }
}
