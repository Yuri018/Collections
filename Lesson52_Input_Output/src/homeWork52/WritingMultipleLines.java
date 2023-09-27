package homeWork52;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingMultipleLines {
    /*
    Напишите программу, которая позволяет пользователю ввести несколько строк текста (используя Scanner)
    и записать их в текстовый файл (result.txt). Признаком того, что пользователь закончил ввод текста,
    должна служить введенная строка "exit" (естественно, она не должна попадать в итоговый файл.
     */
    public static void main(String[] args) {

        writeFromKeyboard();
    }

    public static void writeFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence. To exit, enter \"exit\"");

        try (FileWriter fileWriter = new FileWriter("Lesson52_Input_Output/src/homeWork52/result.txt")) {
            while (true) {
                String str = scanner.nextLine();
                if (str.equalsIgnoreCase("exit")) {
                    break;
                }
                fileWriter.write(str);
            }
        } catch (IOException e) {
            System.out.println("write file error!");
        }

    }
}
