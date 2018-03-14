package com.kodilla.patterns.singleton;

public class Logger {
    private String lastLog = "";
    private static Logger logger = null;

    private Logger(){
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public String getLastLog(){
        return lastLog;
    }
}