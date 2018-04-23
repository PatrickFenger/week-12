
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.*;

public class MyLoader {

    public static void main( String argv[] ) throws Exception {

        try {
            URL[] urls = { new URL( "https://github.com/DatSecurityCourseSpring2018/week-12/raw/master/" ) };
            URLClassLoader loader = new URLClassLoader( urls );

            // Load class from class loader. argv[0] is the name of the class to be loaded
            Class c = loader.loadClass( "Tester" );

            // Create an instance of the class just loaded
            Object o =  c.newInstance();
            // invokeMain
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }

    public static void invokeMain( Class c ) throws NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Method m = c.getMethod( "main", new Class[]{ c } );
        m.setAccessible( true );
        int mods = m.getModifiers();
        if ( m.getReturnType() != void.class || !Modifier.isStatic( mods ) || !Modifier.isPublic( mods ) ) {
            throw new NoSuchMethodException( "main" );
        }
        try {
            m.invoke( null, new Object[]{ "Dummy1", "Dummy2" } );
        } catch ( IllegalAccessException e ) {
        }

    }
}
