package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;
    private static Object obj = new Object();

    static {
        synchronized (obj) {
            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
