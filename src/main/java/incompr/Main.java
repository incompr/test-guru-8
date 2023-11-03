package incompr;

import incompr.data.Product;
import incompr.marketplace.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Ozone ozone = new Ozone(new ArrayList<>());
        SberMarket sberMarket = new SberMarket(new HashMap<String, Product>());
        WB wb = new WB(new LinkedList<Product>());
        YaMarket yaMarket = new YaMarket(new ArrayDeque<Product>());
        AliExpress aliExpress = new AliExpress(new HashSet<Product>());

        Product smartphone = new Product("smartphone", 25000, "Dong-Feng phone X5", 50, true);
        Product washMachine = new Product("WashMachine", 50000, "LG wash-machine", 20, false);
        Product tv = new Product("TVset", 40000, "Samsung SmartTV", 20, false);

        System.out.println("озон добавление:");
        ozone.ozoneAdd(smartphone);
        ozone.ozoneAdd(washMachine);
        ozone.ozoneAdd(tv);
        System.out.println(ozone);
        System.out.println("озон удаление:");
        ozone.ozoneRemove(washMachine);
        System.out.println("озон поиск:");
        System.out.println(ozone.ozoneSearch(tv));

        System.out.println("сбер добавление:");
        sberMarket.sberMarketAdd("tel-34567", smartphone);
        sberMarket.sberMarketAdd("WM-34567", washMachine);
        sberMarket.sberMarketAdd("TV-34567", tv);
        System.out.println(sberMarket);
        System.out.println("сбер удаление:");
        sberMarket.sberRemove("WM-34567", washMachine);
        System.out.println("сбер поиск:");
        System.out.println(sberMarket.sberSearch("TV-34567"));

        System.out.println("WB добавление:");
        wb.wbAdd(smartphone);
        wb.wbAdd(washMachine);
        wb.wbAdd(tv);
        System.out.println(wb);
        System.out.println("WB удаление:");
        wb.wbRemove(washMachine);
        System.out.println("WB поиск:");
        System.out.println(wb.wbSearch(tv));

        System.out.println("YaMarket добавление:");
        yaMarket.yaMarketAdd(smartphone);
        yaMarket.yaMarketAdd(washMachine);
        yaMarket.yaMarketAdd(tv);
        System.out.println(yaMarket);
        System.out.println("YaMarket удаление:");
        yaMarket.yaMarkerRemove(washMachine);
        System.out.println("YaMarket поиск:");
        System.out.println(yaMarket.yaMarketSearch(tv));

        System.out.println("алиэкспресс добавление:");
        aliExpress.aliAdd(smartphone);
        aliExpress.aliAdd(washMachine);
        aliExpress.aliAdd(tv);
        System.out.println(aliExpress);
        System.out.println("алиэкспресс удаление:");
        aliExpress.aliRemove(washMachine);
        System.out.println("алиэкспресс поиск:");
        System.out.println(aliExpress.aliSearch(tv));

        ozone.printCatalog();
        sberMarket.printCatalog();
        wb.printCatalog();
        yaMarket.printCatalog();
        aliExpress.printCatalog();
    }
}