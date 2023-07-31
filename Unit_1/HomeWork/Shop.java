package Unit_1.HomeWork;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Shop {
    private ArrayList<Category> categories = new ArrayList();

    public Shop() {
    }

    public void addCategory(Category category) {
        this.categories.add(category);
    }

    public String printCatalog() {
        Iterator var1 = this.categories.iterator();

        while(var1.hasNext()) {
            Category category = (Category)var1.next();
            System.out.println(category.getName());
            ArrayList<Product> products = category.getProducts();
            Iterator var4 = products.iterator();

            while(var4.hasNext()) {
                Product product = (Product)var4.next();
                PrintStream var10000 = System.out;
                String var10001 = product.getName();
                var10000.println("- " + var10001 + " - " + product.getPrice() + " - " + product.getRating());
            }
        }

        return this.toString();
    }
}
