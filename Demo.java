package lab4;

class Demo {
    String name;

    Demo(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo("Object1");
        Demo d2 = new Demo("Object2");

        d1 = d2;

        System.gc();
    }
}
