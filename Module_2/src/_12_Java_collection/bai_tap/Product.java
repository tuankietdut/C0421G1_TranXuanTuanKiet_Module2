package _12_Java_collection.bai_tap;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;

    public Product()  {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()){
            return 1;
        }else if (this.price < o.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
}
