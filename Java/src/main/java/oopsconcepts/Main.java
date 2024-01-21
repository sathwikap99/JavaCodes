package oopsconcepts;

public class Main {
    public static void main(String[] args) {
        Department department = new DepartmentImpl(4);
        System.out.println(department.getDepartmenSize());


        Product product = new Product(8);
        System.out.println(product.getPrice());
        System.out.println(product.getPrice(2));


        Parent parent1 = new Parent();
        parent1.message();
        Child child1 = new Child();
        child1.message();
        Parent parent2 = new Child();
        parent2.message();

    }
}

