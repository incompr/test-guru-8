package incompr.marketplace;

import incompr.data.Product;

import java.util.ArrayDeque;

public class YaMarket {

    ArrayDeque<Product> yaCatalog;

    public YaMarket(ArrayDeque<Product> yaCatalog) {
        this.yaCatalog = yaCatalog;
    }

    public void yaMarketAdd(Product product) {
        yaCatalog.add(product);
    }

    public void yaMarkerRemove(Product product) {
        if (yaCatalog.remove(product)) {
            System.out.println("...происходит сложная логика при удалении...");
            System.out.println("удалён товар:  " + product);
        } else {
            System.out.println("такого товара нет в каталоге");
        }
    }

    public Product yaMarketSearch(Product product) {
        if (yaCatalog.contains(product)) {
            return product;
        } else {
            System.out.println("такого товара нет в каталоге");
            return null;
        }
    }

    @Override
    public String toString() {
        return "YaMarket{" +
                "yaCatalog=" + yaCatalog +
                '}';
    }

    public void printCatalog() {
        System.out.println("печать и очистка Ямаркет каталог");
        while (!yaCatalog.isEmpty()){
            System.out.println(yaCatalog.pop());
        }
    }
}
