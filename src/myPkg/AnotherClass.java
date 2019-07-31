package myPkg;
import org.apache.log4j.Logger;


public class AnotherClass {
	static Logger log = Logger.getLogger(AnotherClass.class.getName());
	static {
        SystemOutToLog4j.enableForClass(AnotherClass.class);
    }
	public void logHere(){
		//tieSystemOutAndErrToLog();
		System.out.println("in another");
		log.info("Message is from another class");
	}
	/*public  void tieSystemOutAndErrToLog() {
	       System.setOut(createLoggingProxy(System.out));
	       System.setErr(createLoggingProxy(System.err));
	   }
	 

	   public  PrintStream createLoggingProxy(final PrintStream realPrintStream) {
	       return new PrintStream(realPrintStream) {
	           public void print(final String string) {
	               realPrintStream.print(string);
	               log.info(string);
	           }
	           public void println(final String string) {
	               realPrintStream.println(string);
	               log.info(string);
	           }
	       };
	   }*/
}
