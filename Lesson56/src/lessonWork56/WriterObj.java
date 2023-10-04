package lessonWork56;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterObj {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("John", 24, new Car("Opel"));
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object_out.dat"))) {
            os.writeObject(p1);
        }
    }
}
