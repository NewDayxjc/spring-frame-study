package com.xjc.mongodb.monitor;

import com.mongodb.event.CommandFailedEvent;
import com.mongodb.event.CommandListener;
import com.mongodb.event.CommandStartedEvent;
import com.mongodb.event.CommandSucceededEvent;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/18 15:34
 * @name CommandListenerTest
 * 监视器
 */
public class CommandListenerTest implements CommandListener {
    @Override
    public void commandStarted(CommandStartedEvent event) {
        System.out.println(String.format("Sent command '%s:%s' with id %s to database '%s' "
                        + "on connection '%s' to server '%s'",
                event.getCommandName(),
                event.getCommand().get(event.getCommandName()),
                event.getRequestId(),
                event.getDatabaseName(),
                event.getConnectionDescription()
                        .getConnectionId(),
                event.getConnectionDescription().getServerAddress()));
        System.out.println("commandStarted");
    }

    @Override
    public void commandSucceeded(CommandSucceededEvent event) {
        System.out.println(String.format("Successfully executed command '%s' with id %s "
                        + "on connection '%s' to server '%s'",
                event.getCommandName(),
                event.getRequestId(),
                event.getConnectionDescription()
                        .getConnectionId(),
                event.getConnectionDescription().getServerAddress()));
        System.out.println("commandSucceeded");
    }

    @Override
    public void commandFailed(CommandFailedEvent event) {
        System.out.println(String.format("Failed execution of command '%s' with id %s "
                        + "on connection '%s' to server '%s' with exception '%s'",
                event.getCommandName(),
                event.getRequestId(),
                event.getConnectionDescription()
                        .getConnectionId(),
                event.getConnectionDescription().getServerAddress(),
                event.getThrowable()));
        System.out.println("commandFailed");
    }
}

