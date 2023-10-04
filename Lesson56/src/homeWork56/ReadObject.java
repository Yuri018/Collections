package homeWork56;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    /*
    Задача 2
    Создать отдельную программу, которая загружает данные о товаре.
     */
    public static void main(String[] args) {
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("product.dat"))) {

            Product product = (Product) is.readObject();
            System.out.println(product);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
