package lab4;

class Mobile {
    String brand;
    int price;

    Mobile() {
        this("Unknown", 10000);
    }

    Mobile(String b) {
        this(b, 20000);
    }

    Mobile(String b, int p) {
        brand = b;
        price = p;
    }

    void show() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung");
        Mobile m3 = new Mobile("Apple", 150000);

        m1.show();
        m2.show();
        m3.show();
    }
}
