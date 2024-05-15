package cursoAula;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data.");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data:" + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be remove from stock:");
		int quantity1 = sc.nextInt();
		product.removeProduct(quantity1);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}
