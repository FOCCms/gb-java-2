import java.io.*;

public class Main {
    public static void main(String[] args) {
        pow();
    }

    public static void pow(){
        try (BufferedReader br = new BufferedReader(new FileReader(new File("src/input.txt"))))
        {
            // read
            Long a, b;
            String line = br.readLine();
            if(line.startsWith("a")) {
                a = Long.valueOf(line.split(" ")[1]);
                b = Long.valueOf(br.readLine().split(" ")[1]);
            } else {
                b = Long.valueOf(line.split(" ")[1]);
                a = Long.valueOf(br.readLine().split(" ")[1]);
            }

            // calc
            String result = (a == 0 && b == 0) ? "не определено" : String.valueOf(Math.pow(a, b));

            // write
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));
            writer.write(result);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}