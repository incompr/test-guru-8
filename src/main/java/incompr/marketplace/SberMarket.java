package incompr.marketplace;

import incompr.data.Product;

import java.util.HashMap;
import java.util.Map;

public class SberMarket {

    Map<String, Product> sberCatalog;

    public SberMarket(HashMap<String, Product> sberCatalog) {
        this.sberCatalog = sberCatalog;
    }

    public void sberMarketAdd(String article, Product product) {
        sberCatalog.put(article, product);
    }

    public void sberRemove(String article, Product product) {
        if (sberCatalog.remove(article, product)) {
            System.out.println("...происходит сложная логика при удалении...");
            System.out.println("удален товар: " + product);
        } else {
            System.out.println("такого товара нет в каталоге");
        }
    }

    public Product sberSearch(String article) {
        if (sberCatalog.get(article) != null) {
            return sberCatalog.get(article);
        } else {
            System.out.println("такого товара нет в каталоге");
            return null;
        }
    }

    public void printCatalog() {
        System.out.println("печать сберкаталог");
        for (Map.Entry product : sberCatalog.entrySet()) {
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        return "SberMarket{" +
                "sberCatalog=" + sberCatalog +
                '}';
    }
}
