import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            // Start RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            // Create remote object
            HelloImpl obj = new HelloImpl();

            // Bind object with name "Hello"
            Naming.rebind("Hello", obj);

            System.out.println("Hii MadhuCute girl.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}