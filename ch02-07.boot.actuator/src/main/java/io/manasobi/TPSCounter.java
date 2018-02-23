package io.manasobi;

import java.util.Calendar;
import java.util.concurrent.atomic.LongAdder;

public class TPSCounter {

    private LongAdder count;
    private int threshold = 2;
    private Calendar expiry = null;

    public TPSCounter() {
        count = new LongAdder();
        expiry = Calendar.getInstance();
        expiry.add(Calendar.MINUTE, 1);
    }

    boolean isExpired(){
        return Calendar.getInstance().after(expiry);
    }

    boolean isWeak(){
        return (count.intValue() > threshold);
    }

    void increment(){
        count.increment();
    }
}
