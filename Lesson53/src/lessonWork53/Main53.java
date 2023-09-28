package lessonWork53;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;

public class Main53 {
    public static void main(String[] args) {

//        Set<Map.Entry<String, Charset>> charSets = Charset.availableCharsets().entrySet();
//        for(Map.Entry<String, Charset> e:charSets){
//            System.out.println(e.getKey());
//        }


        read();
    }

    public static void read() {
        // KOI8-R
        try (FileReader fr = new FileReader("Lesson53/src/lessonWork53/2.t.txt", StandardCharsets.UTF_8)) {

            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
