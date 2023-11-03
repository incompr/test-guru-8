package incompr.marketplace;

import incompr.data.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AliExpress {
    HashSet<Product> aliCatalog;

    public AliExpress(HashSet<Product> aliCatalog) {
        this.aliCatalog = aliCatalog;
    }

    public void aliAdd(Product product) {
        aliCatalog.add(product);
    }

    public void aliRemove(Product product) {
        boolean isRemoved = aliCatalog.remove(product);

        if (isRemoved) {
            System.out.println("...происходит сложная логика при удалении...");
            System.out.println("удалён товар:  " + product);
        } else {
            System.out.println("такого товара нет в каталоге");
        }
    }

    public Product aliSearch(Product product) {
        if (aliCatalog.contains(product)) {
            return product;
        } else {
            System.out.println("такого товара нет в каталоге");
            return null;
        }
    }

    @Override
    public String toString() {
        return "AliExpress{" +
                "aliCatalog=" + aliCatalog +
                '}';
    }

    public void printCatalog() {
        System.out.println("печать Али каталог");
        Iterator<Product> iterator = aliCatalog.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

