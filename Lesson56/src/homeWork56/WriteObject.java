package homeWork56;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    /*
        Задача 1
    Создать класс товар, с несколькими полями (наименование, цена, количество).
    Создать объект этого класса. Выгрузить этот объект используя ObjectOutputStream
        Задача 3
    Добавить поле скидка в класс Товар в выгружающей программе (в загружающей не менять класс).
    Сделать так, что бы данные о скидке не выгружались. Проверить сможет ли загружающая программа прочитать товар,
    выгруженный после добавления поля скидка.
     */
    public static void main(String[] args) {
        Product product1 = new Product(1001, "Book", 300.0, 10, 5);

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("product.dat"))) {

            os.writeObject(product1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
