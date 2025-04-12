package lk.jiat.rmi;

import lk.jiat.rmi.client.StudentService;
import lk.jiat.rmi.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {

    protected StudentServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public List<Student> getStudents() throws RemoteException {
        return List.of(
                new Student(1, "Senuri", "Ragama", "0762345678"),
                new Student(2, "Rashi", "Mirigama", "0752345690"),
                new Student(2, "Mudith", "Perth", "0710001111"),
                new Student(3, "Oshan", "Dehiaththakandiya", "0789900990"),
                new Student(4, "Sachintha", "Anuradhapura", "0721348878")
        );
    }
}
