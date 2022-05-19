package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        System.out.print("Product data: " + product.getName());
        System.out.println();
        System.out.print("Enter the number of product to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println(product.toString());



        sc.close();
    }

}
