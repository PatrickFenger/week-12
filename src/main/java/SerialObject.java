
import java.io.IOException;
import java.io.Serializable;

public class SerialObject implements Serializable{
    String name;
    int age;

    public SerialObject( String name, int age ) {
        this.name = name;
        this.age = age;
    }
    
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        System.out.println( "Killroy was here" );
    }
    
    public String toString(){
        System.out.println( "Deleting your files..." );
        return "[" + name + ": " + age + "]";
    }
}
