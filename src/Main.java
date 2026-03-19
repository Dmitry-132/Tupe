//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product dog = new Product(1, "dog", 200, "pet");
        Product dogs = new Product(1, "dogs", 200, "pet");
        Product cat = new Product(2, "cat", 100, "pet");
        Product mouse = new Product(3, "mouse", 50, "pet");

        System.out.println(dog);
        System.out.println(dogs);
        System.out.println(dogs.equals(dog));
        Product[] products1 = {dog,dogs};
        Product[] products2 = {dog,cat};

        Order v1 = new Order("ШаурМафия",products1);
        Order v2 = new Order("ШаурМафия",products2);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.equals(v2));












    }
}