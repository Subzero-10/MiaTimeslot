package com.example.miatimeslot;

import net.time4j.*;
import net.time4j.format.expert.ChronoFormatter;
import net.time4j.format.expert.PatternType;
import net.time4j.tz.olson.*;

import java.util.Locale;

import static net.time4j.ClockUnit.HOURS;

public class timeZone {
    //获取系统的日期

    Moment nowTime = SystemClock.currentMoment();

    void testTime()
    {
        System.out.println(
                "!!!!!!!!!!!!!!test-Time: "
                        + SystemClock.inZonalView(AMERICA.SAO_PAULO).now().until(SystemClock.inZonalView(ASIA.SHANGHAI).now(),HOURS)
        );//负数再减一
    }

    void brTime()
    {
        System.out.println(
                "巴西 巴西利亚: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        AMERICA.SAO_PAULO
                ).format(nowTime)
        );
    }
    void mxTime()
    {
        System.out.println(
                "墨西哥 墨西哥城: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        AMERICA.MEXICO_CITY
                ).format(nowTime)
        );
    }
    void clTime()
    {
        System.out.println(
                "智利 圣地亚哥: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        AMERICA.SANTIAGO
                ).format(nowTime)
        );
    }
    void useTime()
    {
        System.out.println(
                "美东 纽约: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        AMERICA.NEW_YORK
                ).format(nowTime)
        );
    }
    void uswTime()
    {
        System.out.println(
                "美西 洛杉矶: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        AMERICA.LOS_ANGELES
                ).format(nowTime)
        );
    }
    void nzTime()
    {
        System.out.println(
                "新西兰 奥克兰: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        PACIFIC.AUCKLAND
                ).format(nowTime)
        );
    }
    void auTime()
    {
        System.out.println(
                "澳大利亚 墨尔本: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        AUSTRALIA.MELBOURNE
                ).format(nowTime)
        );
    }
    void ruTime()
    {
        System.out.println(
                "俄罗斯 莫斯科: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        EUROPE.MOSCOW
                ).format(nowTime)
        );
    }
    void cnTime()
    {
        System.out.println(
                "中国 北京: "
                        + ChronoFormatter.ofMomentPattern(
                        "uuuu-MM-dd'T'HH:mm:ssXX",
                        PatternType.CLDR,
                        Locale.ROOT,
                        ASIA.SHANGHAI
                ).format(nowTime)
        );
    }

}
