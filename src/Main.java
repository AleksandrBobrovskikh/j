import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("out.txt");
        fw.write("Hello");
        fw.flush(); // эта функция передает из мнигого массива куда сначала записываются данные в файл,
                    // Если так не сделать, вероятность незаписи существует
        fw.close(); // закрыть поток


    }
}