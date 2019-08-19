import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    // TODO GP comment: remove the throws IOException and InterruptedException
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyy HH:mm:ss");
        BufferedWriter writer = null;

        while(true) {
            try {
                writer = new BufferedWriter(new FileWriter("datefile.html"));
                writer.write("<html><body><h1>" + dateFormat.format(new Date()) + "</h1></body></html>");

            }
            catch (Exception e){
                System.out.println("Failed during File Write Operation");
            } finally{
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("Cannot close file");
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
