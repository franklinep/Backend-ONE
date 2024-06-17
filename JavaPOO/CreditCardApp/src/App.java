import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //1. Datos del credit card
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese limite de saldo de credito: ");
        double balance = sc.nextDouble();
        CreditCard myCreditCard = new CreditCard("Franklin", balance);
        
        //2. Realizamos compras
        String opt = "YES";
        do {
            // Datos del producto
            System.out.println("Escriba la descripcion de la compra: ");
            sc.nextLine(); // Consume la nueva línea pendiente después de nextDouble()
            String name = sc.nextLine();
            System.out.println("Escriba el valor de la compra: ");
            double price = sc.nextDouble();
            // Agregamos a nuestra lista de productos
            Product p = new Product(name, price);
            myCreditCard.addProduct(p);

            // Finalizacion
            System.out.println("Desea continuar? (Yes/No): ");
            opt = sc.next();
            System.out.println();

        } while (opt.equalsIgnoreCase("YES"));

        myCreditCard.receipt();
        sc.close();
    }
}
