package lab4;

class LibraryBook {
    String title;
    double price;

    LibraryBook() {
        title = "Unknown";
        price = 0;
    }

    LibraryBook(String t) {
        title = t;
        price = 500;
    }

    LibraryBook(String t, double p) {
        title = t;
        price = p;
    }

    void show() {
        System.out.println(title + " " + price);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook("Java");
        LibraryBook b3 = new LibraryBook("OOP", 800);

        b1.show();
        b2.show();
        b3.show();
    }
}
