
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer>  data = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String key;
        int value;
        boolean exit = true;
        do{ 
            System.out.println("Masukkan pasangan Key-Value ke dalam HashMap");
        System.out.print("Key: ");
        key = input.nextLine();
        
            if (!key.equalsIgnoreCase("exit")) {
                System.out.print("Va;ue: ");
                value = input.nextInt();
                input.nextLine();
                
                data.put(key, value);
            }
        }while(!key.equalsIgnoreCase("exit"));
        System.out.println("\nData yang dimasukkan ke dalam HashMap:");
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
