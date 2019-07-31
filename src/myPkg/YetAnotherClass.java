package myPkg;
import org.apache.log4j.Logger;


public class YetAnotherClass {
	static Logger log = Logger.getLogger(YetAnotherClass.class.getName());

	public void logHere(){
		System.out.println("in yet another");
		log.info("Message is from yet another class");
	}
}
