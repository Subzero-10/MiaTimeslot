package com.example.miatimeslot;

import net.time4j.*;
import net.time4j.format.expert.ChronoFormatter;
import net.time4j.format.expert.PatternType;
import net.time4j.tz.TZID;
import net.time4j.tz.olson.*;

import java.util.Locale;
import static net.time4j.ClockUnit.HOURS;

public class timeSlot {

    String searchTimeSlot(TZID tzid)
    {
        long toWorkTime = 8;
        long offWorkTime = 21;
        long toWorkTime2 = 8;
        long offWorkTime2 = 21;
        long difference = SystemClock.inZonalView(tzid).now().until(SystemClock.inZonalView(ASIA.SHANGHAI).now(),HOURS);
        if (difference<=0)
            difference--;
        boolean yesterday = false;

        if (difference>0)
        {
            if(difference<12)
            {
                toWorkTime = 8 + difference;
                offWorkTime2 = 21 - difference;
            }
            else
            {
                offWorkTime = 21 - 24 + difference;
                toWorkTime2 = 8 + 24 - difference;
                yesterday = true;
            }
        }
        else
        {
            if (difference>-12)
            {
                offWorkTime = 21 + difference;
                toWorkTime2 = 8 - difference;
            }
            else
            {
                toWorkTime = 8 + 24 + difference;
                offWorkTime2 = 21 - 24 + difference;
                yesterday = true;
            }
        }
        if (yesterday)
            return "合适的时间从北京时间"+toWorkTime+"点到"+offWorkTime+"点，当地时间为前一天"+toWorkTime2+"点到"+offWorkTime2+"点";
        else
            return "合适的时间从北京时间"+toWorkTime+"点到"+offWorkTime+"点，当地时间为"+toWorkTime2+"点到"+offWorkTime2+"点";

    }
}
