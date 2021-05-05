package NLayeredDemo.Core;

import NLayeredDemo.JLogger.JLoggerManager;

public class LoggerManager implements LoggerService{

    JLoggerManager manager=new JLoggerManager();

    @Override
    public void logToSystem(String message) {
        manager.log(message);

    }
}
