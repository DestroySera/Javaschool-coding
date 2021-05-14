package week01.week01day5;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class test1 {
	 private final static Logger LOG = Logger.getGlobal();
	    
	    public static void main(String[] args) throws SecurityException, IOException {
	        //=============================================
	        // 기본 로그 제거
	        //------------
	        Logger rootLogger = Logger.getLogger("");
	        Handler[] handlers = rootLogger.getHandlers();
	        if (handlers[0] instanceof ConsoleHandler) {
	            rootLogger.removeHandler(handlers[0]);
	        }
	        //=============================================
	        
	        LOG.setLevel(Level.INFO);
	        
	        Handler handler = new FileHandler("message.log", true);
	        
	        CustomLogFormatter formatter = new CustomLogFormatter();
	        handler.setFormatter(formatter);
	        LOG.addHandler(handler);
	        
	        LOG.severe("severe Log");
	        LOG.warning("warning Log");
	        LOG.info("info Log");
	    }
	}