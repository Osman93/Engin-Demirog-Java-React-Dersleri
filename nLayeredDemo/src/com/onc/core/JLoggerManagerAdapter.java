package com.onc.core;

import com.onc.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    private JLoggerManager jLoggerManager;

    public JLoggerManagerAdapter(JLoggerManager jLoggerManager) {
        this.jLoggerManager = jLoggerManager;
    }

    @Override
    public void logSystem(String message) {
        jLoggerManager.log(message);
    }
}
