package myPkg;
import org.apache.log4j.Logger;

public class log4jExample{

   /* Get actual class name to be printed on */
   static Logger log = Logger.getLogger(log4jExample.class.getName());
   
   public static void main(String[] args){
	   System.out.println("BEFORE DEBUG TEST");
	   
	   System.out.println("START DEBUG TEST");
      log.debug("Hello this is a debug message");
      log.info("Hello this is an info message");
      System.out.println("END DEBUG TEST");
      AnotherClass a = new AnotherClass();
      a.logHere();
      
      YetAnotherClass y = new YetAnotherClass();
      y.logHere();
      System.out.println("END -----");
   }
   
  
}