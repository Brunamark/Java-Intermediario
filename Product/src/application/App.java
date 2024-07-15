
package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product;
        product = new Product();

        System.out.println("Enter the product name: ");
        String name = sc.nextLine();
        product.setName(name);

        System.out.println("Enter the product price: ");
        double price = sc.nextDouble();
        product.setPrice(price);

        System.out.println("Enter the product quantity: ");
        int quantity = sc.nextInt();
        product.setQuantity(quantity);


        int choice;
        do {
            System.out.println("Enter the numbers below to take action: ");
            System.out.println("0 - exit");
            System.out.println("1 - Total Value in Stock");
            System.out.println("2 - Add products");
            System.out.println("3 - Remove products");
            System.out.println("4 - Show all information");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    double value = product.totalValueInStock();
                    System.out.println("The total value is: " + value);
                    break;
                case 2:
                    System.out.println("Enter the quantity to add in stock: ");
                    quantity = sc.nextInt();
                    product.addProducts(quantity);
                    System.out.println("The quantity " + quantity + " has been added");
                    break;
                case 3:
                    System.out.println("Enter the quantity to remove from stock: ");
                    quantity = sc.nextInt();
                    product.removeProducts(quantity);
                    System.out.println("The quantity " + quantity + " has been removed");
                    break;
                    case 4:
                    System.out.println(product);
                    break;
            }
        } while (choice != 0);
        System.out.println("Exit the program...");

        sc.close();
    }
}
