package com.example.miatimeslot;

import net.time4j.*;
import net.time4j.format.expert.ChronoFormatter;
import net.time4j.format.expert.PatternType;
import net.time4j.tz.TZID;
import net.time4j.tz.olson.*;

import java.util.Locale;

import static net.time4j.ClockUnit.HOURS;

public class timeZone {
    //获取系统的日期

    Moment nowTime = SystemClock.currentMoment();

    String testTime()
    {
        System.out.println(
                "!!!!!!!!!!!!!!test-Time: "
                        + SystemClock.inZonalView(AMERICA.SAO_PAULO).now()
        );//负数再减一
        return SystemClock.inZonalView(AMERICA.SAO_PAULO).now().toString();
    }

    String brTime()
    {
        return "<b><tt>巴西 巴西利亚:</tt></b> "+string2builder(AMERICA.SAO_PAULO);
    }
    String mxTime()
    {
        return "<b><tt>墨西哥 墨西哥城:</tt></b> "+string2builder(AMERICA.MEXICO_CITY);
    }
    String clTime()
    {
        return "<b><tt>智利 圣地亚哥:</tt></b> "+string2builder(AMERICA.SANTIAGO);
    }
    String useTime()
    {
        return "<b><tt>美东 纽约:</tt></b> "+string2builder(AMERICA.NEW_YORK);
    }
    String uswTime()
    {
        return "<b><tt>美西 洛杉矶:</tt></b> "+string2builder(AMERICA.LOS_ANGELES);
    }
    String nzTime()
    {
        return "<b><tt>新西兰 奥克兰:</tt></b> "+string2builder(PACIFIC.AUCKLAND);
    }
    String auTime()
    {
        return "<b><tt>澳大利亚 墨尔本:</tt></b> "+string2builder(AUSTRALIA.MELBOURNE);
    }
    String ruTime()
    {
        return "<b><tt>俄罗斯 莫斯科:</tt></b> "+string2builder(EUROPE.MOSCOW);
    }
    String cnTime()
    {
        return "<b><tt>中国 北京:</tt></b>  "+string2builder(ASIA.SHANGHAI);
    }
    private StringBuilder string2builder(TZID tzid)
    {
        StringBuilder time = new StringBuilder(SystemClock.inZonalView(tzid).now().toString());
        time.setCharAt(10,' ');
        time.delete(18,22);
        return time;
    }

}
