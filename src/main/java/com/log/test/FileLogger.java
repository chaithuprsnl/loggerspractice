package com.log.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class FileLogger {

	private static final Logger logger = LoggerFactory.getLogger(FileLogger.class);
	
	public static void main(String[] args){
		
		MDC.put("user", "krishna");
		logger.trace("Trace log");
		logger.debug("Debug log");
		logger.info("Info log Dummy Log");
		logger.warn("Warn log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log Dummy Log");
		logger.error("Error log");
		
	}

}
