package lk.jiat.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) {
        try {

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("msg_service", new MsgImpl());
            registry.bind("student_service", new StudentServiceImpl());
            System.out.println("RMI Server running...");

        } catch (Exception e) {
            System.out.println("RMI Server failed to start: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
