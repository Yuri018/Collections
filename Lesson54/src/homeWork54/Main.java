package homeWork54;

import java.io.*;

public class Main {
    /*
    По ссылке https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing находится файл file.dat .
    Сохраните этот файл на диск (просто из браузера) . Ваша программа  должна записать в отдельный файл первые 601 байт,
    затем в отдельный файл записать следующие 57053 байта и оставшиеся 22494 байта записать в следующий файл.
    Если все сделано правильно, у вас должно получиться 3 файла.

В одном из этих файлов лежит gif картина, в другом jpg картинка, еще в одном скомпилированный .class файл java программы.
Вам нужно написать программу, которая определит, в каком файле что лежит.
Сделать это можно используя так называемые сигнатуры файлов:
gif должен начинаться с шестнадцатеричной  последовательности байт 47 49 46 38 39 61
jpeg с последовательности ff d8
java .class файл с шестнадцатеричной  последовательности ca fe ba be

Сохраните файл, опознанный как .class файл под именем Main.class и запустите его из командной строки java Main.
Если у вас получилось, на экране вы прочитайте кодовое слово.
     */

    public static void main(String[] args) {

        String dataFile = "Lesson54/src/homeWork54/file.dat";
        int fileSize1 = 601;
        int fileSize2 = 57053;
        int fileSize3 = 22494;
        String file1 = "Lesson54/src/homeWork54/file1.dat";
        String file2 = "Lesson54/src/homeWork54/file2.dat";
        String file3 = "Lesson54/src/homeWork54/file3.dat";

        try {
            readFromFile(dataFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readFromFile(String path) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));

        int fileSize1 = 601;
        int fileSize2 = 57053;
        int fileSize3 = 22494;

        byte[] file1 = new byte[fileSize1];
        byte[] file2 = new byte[fileSize2];
        byte[] file3 = new byte[fileSize3];

        int data;
        while ((data = bis.read()) != -1) {

            writeToFile(bis.read(file1, 0, fileSize1), "Lesson54/src/homeWork54/file1.dat");
            writeToFile(bis.read(file2, 0, fileSize2), "Lesson54/src/homeWork54/file2.dat");
            writeToFile(bis.read(file3, 0, fileSize3), "Lesson54/src/homeWork54/file3.dat");
        }
    }

    public static void writeToFile(int data, String file) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
            bos.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
