package cphkasper.week12deserialization;

import java.net.*;
public class MyLoader {
   public static void main (String argv[]) throws Exception {

      URLClassLoader loader = new URLClassLoader(new URL[] { new URL("http://www.javacourses.com/classes/") });
    
      // Load class from class loader. argv[0] is the name of the class to be loaded
      Class c = loader.loadClass ("cphkasper.week12deserialization.Tester");

      // Create an instance of the class just loaded
      Object o = c.newInstance();

  }
}
