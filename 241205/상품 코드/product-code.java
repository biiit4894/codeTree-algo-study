import java.util.Scanner;

class Product {
    String productName;
    int productCode;

    public Product(String productName, int productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();

        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(name, code);

        System.out.println("product " + product1.productCode + " is " + product1.productName);
        System.out.println("product " + product2.productCode + " is " + product2.productName);
    }
}