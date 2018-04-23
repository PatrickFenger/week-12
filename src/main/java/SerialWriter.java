
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * The purpose of SerialWriter is to...
 * @author kasper
 */
public class SerialWriter {
    public static void main( String[] args ) {
        try {
            SerialObject myObj = new SerialObject("RubberDuck", 24);
            FileOutputStream fos = new FileOutputStream("rubberduck.ser");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(myObj);
            os.close();
        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }
}
