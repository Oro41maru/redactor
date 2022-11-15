import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) {
        String outputFileName = "C:\\Users\\egefr\\Desktop\\aa.txt";
        System.out.println("Введите текст. Чтобы его перезаписать, зайдите в программу еще раз. Чтобы закончить ввод напишите 'exit': ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}