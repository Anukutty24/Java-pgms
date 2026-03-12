import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Lookup remote object (must match server name)
            Hello stub = (Hello) Naming.lookup("rmi://localhost:1099/Hello");

            // Call remote method
            System.out.println(stub.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}