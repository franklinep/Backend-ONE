import java.util.HashMap;
import java.util.Map;

public class CreditCard {
    private String owner;
    private double balance;
    private Map<Product, Integer> products;

    public CreditCard(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
        products = new HashMap<>();
    }

    public void addProduct(Product p){
        if(balance - p.getPrice() >= 0){
            if(products.containsKey(p)){
                products.put(p, products.get(p)+1);
            }else{
                products.put(p, 1);
            }
            System.out.println("Compra Exitosa!");
            balance -= p.getPrice();
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void receipt(){
        System.out.printf("Bienvenido %s, se adjunta el recibo de su compra\n", this.owner);
        System.out.println("==========================================");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("==========================================");
        System.out.printf("Saldo: %.2f\n", this.balance);
    }

}
