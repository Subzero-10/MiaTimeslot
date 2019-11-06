package com.example.miatimeslot;

import net.time4j.*;
import net.time4j.format.expert.ChronoFormatter;
import net.time4j.format.expert.PatternType;
import net.time4j.tz.TZID;
import net.time4j.tz.olson.*;

import java.util.Locale;
import static net.time4j.ClockUnit.HOURS;

public class timeSlot {

    String searchTimeSlot(TZID tzid1,TZID tzid2)
    {
        long toWorkTime = 8;
        long offWorkTime = 21;
        long difference = SystemClock.inZonalView(tzid1).now().until(SystemClock.inZonalView(tzid2).now(),HOURS);
        if (difference<=0)
            difference--;

        if (tzid1 == ASIA.SHANGHAI)
        {
            if (difference>0)
                offWorkTime = 21 - difference;
            else
                toWorkTime = 8 - difference;
        }
        else if (tzid2 == ASIA.SHANGHAI)
        {
            if (difference>0)
                toWorkTime = 8 + difference;
            else
                offWorkTime = 21 + difference;
        }
        else
            return "两地时间差为"+difference;
        return "合适的时间从"+toWorkTime+"点到"+offWorkTime+"点";

    }
}
