package lab4;

class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    Employee(Employee e) {
        name = e.name;
        salary = e.salary;
    }

    void show() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ali", 50000);
        Employee e2 = new Employee(e1);

        e2.salary = 60000;

        e1.show();
        e2.show();
    }
}
