
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The purpose of SerialReader is to...
 * @author kasper
 */
public class SerialReader {
    public static void main( String[] args ) {
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("rubberduck.ser");
            ois = new ObjectInputStream(fis);
            //Read the object from the data stream, and convert it back to a String
            SerialObject objectFromDisk = (SerialObject)ois.readObject();
            //Print the result.
            System.out.println(objectFromDisk.name);
            ois.close();
        } catch ( IOException | ClassNotFoundException ex ) {
            ex.printStackTrace();
        } 
    }
    
    public static void readFromURL( String urlString ) {
        try {
            URL url = new URL( urlString );
            URLConnection connection = url.openConnection();
            ObjectInputStream ois = new ObjectInputStream( connection.getInputStream());
            // ... to do
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
