package incompr.marketplace;

import incompr.data.Product;

import java.util.List;

public class Ozone {
    List<Product> ozoneCatalog;

    public Ozone(List<Product> ozoneCatalog) {
        this.ozoneCatalog = ozoneCatalog;
    }

    public void ozoneAdd(Product product) {
        ozoneCatalog.add(product);
    }

    public void ozoneRemove(Product product) {
        boolean isRemoved = ozoneCatalog.remove(product);

        if (isRemoved) {
            System.out.println("...происходит сложная логика при удалении...");
            System.out.println("удалён товар:  " + product);
        } else {
            System.out.println("такого товара нет в каталоге");
        }
    }

    public Product ozoneSearch(Product product) {
        int index = ozoneCatalog.indexOf(product);
        if (index != -1) {
            return ozoneCatalog.get(index);
        } else {
            System.out.println("такого товара нет в каталоге");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Ozone{" +
                "ozoneCatalog=" + ozoneCatalog +
                '}';
    }

    public void printCatalog() {
        System.out.println("печать Озон каталог");
        for (int i =0;i< ozoneCatalog.size();i++){
            System.out.println(ozoneCatalog.get(i));
        }
    }
}
