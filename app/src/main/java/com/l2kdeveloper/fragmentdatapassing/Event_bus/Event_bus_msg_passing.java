package com.l2kdeveloper.fragmentdatapassing.Event_bus;

/**
 * Created by sourav on 2/4/18.
 */

public class Event_bus_msg_passing {
    private static String value;

    public Event_bus_msg_passing(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
