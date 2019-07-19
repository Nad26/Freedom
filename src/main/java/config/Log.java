package config;

import com.aventstack.extentreports.Status;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {


    static Logger log = Logger.getLogger(Log.class);

    public static void logConfig() {
        PropertyConfigurator.configure("log4j.properties");
    }

    public static void info(String message) {
        log.info(message);
    }

    public static void warn(String message) {
        log.warn(message);
    }

    public static void asserts(Boolean assertion, String message) {
        log.assertLog(assertion,message);
    }
}





