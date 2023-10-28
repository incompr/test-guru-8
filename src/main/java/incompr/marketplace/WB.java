package incompr.marketplace;

import incompr.data.Product;

import java.util.LinkedList;

public class WB {

    LinkedList<Product> wbCatalog;

    public WB(LinkedList<Product> wbCatalog) {
        this.wbCatalog = wbCatalog;
    }

    public void wbAdd(Product product) {
        wbCatalog.add(product);
    }

    public void wbRemove(Product product) {
        if (wbCatalog.remove(product)) {
            System.out.println("...происходит сложная логика при удалении...");
            System.out.println("удалён товар:  " + product);
        } else {
            System.out.println("такого товара нет в каталоге");
        }
    }

    public Product wbSearch(Product product) {
        int index = wbCatalog.indexOf(product);
        if (index != -1) {
            return wbCatalog.get(index);
        } else {
            throw new RuntimeException("not found");
        }
    }

    public void printCatalog() {
        System.out.println("Печать ВБ каталог");
        int i = 0;
        do {
            System.out.println(wbCatalog.get(i));
            i++;
        } while (i < wbCatalog.size());
    }

    @Override
    public String toString() {
        return "WB{" +
                "wbCatalog=" + wbCatalog +
                '}';
    }
}
