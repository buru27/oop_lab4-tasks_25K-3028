package lab4;

class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }

    static Product increase(Product p) {
        Product newProduct = new Product(p.name, p.price + 100);
        return newProduct;
    }

    void show() {
        System.out.println(name + " " + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = increase(p1);

        p1.show();
        p2.show();
    }
}
