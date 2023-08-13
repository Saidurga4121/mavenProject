package log4j;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	public static void main(String[] args) {
		Logger log= LogManager.getLogger(Demo.class);
		
		System.out.println("started.............");
		
		log.info("Enter information");
		log.error("this is error");  
        log.fatal("this is fatal");
        log.warn("this is warning");
        
        System.out.println("completed.............");
        
	}

}
