import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.evo.pruebas.Pruebas;

 

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Pruebas.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      if(result.wasSuccessful())
    	  System.out.println("LAS PRUEBAS HAN PASADO CORRECTAMENTE");
      else
    	  System.out.println("LAS PRUEBAS HAN FALLADO");
   }
}  	