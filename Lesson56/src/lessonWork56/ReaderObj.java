package lessonWork56;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("object_out.dat"))) {
//            String str = (String) is.readObject();
            Person person = (Person) is.readObject();
            System.out.println(person);
        }
    }
}
