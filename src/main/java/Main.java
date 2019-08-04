import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyy HH:mm:ss");
        BufferedWriter writer = null;

        while(true) {
            try {
                writer = new BufferedWriter(new FileWriter("datefile.html"));
                writer.write("<html><body><h1>" + dateFormat.format(new Date()) + "</h1></body></html>");

            } finally {
                if (writer != null)
                    writer.close();
            }
            Thread.sleep(1000);
        }

    }

}
