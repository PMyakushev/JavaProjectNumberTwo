//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Unit_1.HomeWork;

public class Product {
    private String name;
    private Integer price;
    private Double rating;

    public Product(String name, Integer price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getRating() {
        return this.rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Name: " + this.name + ", Price: " + this.price + ", Rating: " + this.rating;
    }
}
