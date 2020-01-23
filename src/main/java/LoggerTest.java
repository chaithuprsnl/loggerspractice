import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class LoggerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
	
	public static void main(String[] args){
		
		MDC.put("user", "krishna");
		logger.trace("Trace log");
		logger.debug("Debug log");
		logger.info("Info log");
		logger.warn("Warn log");
		logger.error("Error log");
		
	}

}
