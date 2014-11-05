/*******************************************************************************
 * Copyright (c) 2014 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *    Mike Robertson - initial contribution
 *******************************************************************************/
package com.ibm.demo.IoTStarter.utils;

import android.content.Context;
import com.ibm.demo.IoTStarter.IoTStarterApplication;

/**
 * Build topic strings used by the application.
 */
public class TopicFactory {

    private static TopicFactory instance;
    private IoTStarterApplication app;

    public static TopicFactory getInstance(Context context) {
        if (instance == null) {
            instance = new TopicFactory(context);
        }
        return instance;
    }

    /**
     * Return the applications instance of the TopicFactory object.
     *
     * @param context The application context.
     */
    private TopicFactory(Context context) {
        app = (IoTStarterApplication) context.getApplicationContext();
    }

    /**
     * @param event The event to create a topic string for.
     * @return The event topic for the specified event string.
     */
    public static String getEventTopic(String event) {
        return Constants.EVENT_TOPIC + event + "/fmt/json";
    }

    /**
     * @param command The command to create a topic string for.
     * @return The command topic for the specified command string.
     */
    public static String getCommandTopic(String command) {
        return Constants.COMMAND_TOPIC + command + "/fmt/json";
    }
}
