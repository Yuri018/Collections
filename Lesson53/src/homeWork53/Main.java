package homeWork53;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*
Дан файл с текстом вида:

jack:2000
john:2900
greta:3100
john:1300
nick:1200
greta:500
...

т.е. имя и сумма оплаты. Ваша задача прочитать файл, и сформировать два файла: part1 cо списком тех,
кому перечисленно в сумме менее 2000 и part2 cо списком тех, кому перечисленно в сумме более 2000
Обратите внимание, если в исходном фпйле john фигурирует дважды (как в нашем примере),
это означает что один и тот же человек и ему выплачивали дважды.
Таким образом, в итоговом файле для jhon-а должна быть запись john:4200
и эта строка должна ьыть в файле part2
     */
    public static void main(String[] args) {
        String path = "Lesson53/src/homeWork53/Data to be processed.txt";
        fileRider(path);

    }

    public static void fileRider(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<String> list = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            stringProcessing(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void stringProcessing(List<String> list) throws IOException {
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();

        for (String s : list) {
            String[] data = s.split(":");
            if (Integer.parseInt(data[1]) < 2000){
                part1.append(data[0]).append(":").append(data[1]).append(", ");
            } else {
                part2.append(data[0]).append(":").append(data[1]).append(", ");
            }
        }
        System.out.println(part1);
        System.out.println(part2);
        writeToFile(String.valueOf(part1), "Lesson53/src/homeWork53/part1.txt");
        writeToFile(String.valueOf(part2), "Lesson53/src/homeWork53/part2.txt");
    }

    public static void writeToFile(String str, String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            bw.write(str);
            bw.newLine();
        }

    }
}
