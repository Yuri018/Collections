package lessonWork52;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

        writeFile2("Hello World!!!1111_2222");
//        writeFile3("Hello World!!!3333_4444");
        read();
        read2();

    }

    public static void writeFile(String str){// старый вариант
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("Lesson52_Input_Output\\1111.txt");
            for (char ch: str.toCharArray()){
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile2(String str){// вариант с Java 8

        try (FileWriter fileWriter = new FileWriter("Lesson52_Input_Output\\1111.txt");
             FileWriter fileWriter1 = new FileWriter("Lesson52_Input_Output\\2222.txt")){
            for (char ch: str.toCharArray()){
                fileWriter.write(ch);
                fileWriter1.write(ch);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeFile3(String str){// вариант с Java 8 с записью сразу всей строки

        try (FileWriter fileWriter = new FileWriter("Lesson52_Input_Output\\3333.txt")){

                fileWriter.write(str);
//                fileWriter1.write(str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void read(){
        try (FileReader fileReader = new FileReader("Lesson52_Input_Output\\3333.txt")){

            int data;
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("read file error!");
        }
    }
    public static void read2(){
        //System.out.println(Charset.availableCharsets());
        try(FileReader fileReader = new FileReader("Lesson52_Input_Output\\2222.txt", Charset.forName("windows-1251"));) {
            int data;
            while ((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("read file error!");
        }

    }

}
