
package Unit_1.HomeWork;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Category category1 = new Category("Овощи");
        category1.addProduct(new Product("Морковь", 150, 45.6));
        category1.addProduct(new Product("Свекла", 200, 89.1));
        category1.addProduct(new Product("Лук", 95, 76.4));
        Category category2 = new Category("Ягоды");
        category2.addProduct(new Product("Арбуз", 16, 93.2));
        category2.addProduct(new Product("Дыня", 50, 75.6));
        System.out.println("Есть в наличие");
        shop.addCategory(category1);
        shop.addCategory(category2);
        shop.printCatalog();
        System.out.println("\n");
        User user1 = new User("Usser1", "Password1");
        User user2 = new User("Usser2", "Password2");
        user1.getBasket().addProduct((Product)category1.getProducts().get(1));
        user2.getBasket().addProduct((Product)category2.getProducts().get(0));
        category1.getProducts().remove(1);
        category2.getProducts().remove(0);
        System.out.println(user1.getLogin() + " - Покупатель");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        Iterator var7 = user1Products.iterator();

        PrintStream var10000;
        String var10001;
        while(var7.hasNext()) {
            Product product = (Product)var7.next();
            var10000 = System.out;
            var10001 = product.getName();
            var10000.println("- " + var10001 + " - " + product.getPrice() + " - " + product.getRating());
        }

        System.out.println(user2.getLogin() + " - Покупатель");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        Iterator var11 = user2Products.iterator();

        while(var11.hasNext()) {
            Product product = (Product)var11.next();
            var10000 = System.out;
            var10001 = product.getName();
            var10000.println("- " + var10001 + " - " + product.getPrice() + " - " + product.getRating());
        }

        System.out.println("\nОсталось в магазине");
        shop.printCatalog();
    }
}
