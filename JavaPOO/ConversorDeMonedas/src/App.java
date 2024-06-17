import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String str;
        String welcome = """
                Bienvenido a su Conversor de Monedas - ONE G6
                ==========Formato de ingreso==========
                \tMonto a convertir - Codigo de la Moneda Base - Codigo de la Moneda objetiva
                ========================================
                Por favor, ingresa los datos:
                """;

        
        Scanner sc = new Scanner(System.in);    
        System.out.println(welcome);
        ConversorMoneda cm = new ConversorMoneda();
        str = sc.nextLine(); 
        str = str.replace(" ", ""); // --> Quita espacios en blanco 
        System.out.println(str);
        String[] all = str.split("-"); // [base,baseCode,tagetCode]
        for (String s : all) {
            System.out.println(s);
        }
        Double target = cm.convertir(all[0], all[1], all[2]);
        System.out.printf("Moneda Convertida: %f.2\n",target);
        sc.close();
    }
}
