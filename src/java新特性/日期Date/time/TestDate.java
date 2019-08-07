package java新特性.日期Date.time;

import 工具类.DateUtil;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TestDate {
//    private static final java.time.ZoneId ZoneId = ;

    public static void main(String[] args) {
        //1.获取当前日期(年月日)     2019-08-07
        LocalDate localDate=LocalDate.now();
        //2.根据年月日构建date
        LocalDate localDate1=LocalDate.of(2019,8,19);
        // 3. 字符串转换日期,默认按照yyyy-MM-dd格式，也可以自定义格式 -----打印输出-----2018-01-30
        LocalDate localDate2 = LocalDate.parse("2018-01-30");
        // 4. 获取本月第一天 -----打印输出-----2019-08-01
        LocalDate firstDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
        // 5. 获取本月第二天  -----打印输出-----2019-08-02
        LocalDate secondDayOfMonth = localDate.withDayOfMonth(2);
        // 6. 获取本月最后一天 -----打印输出-----2019-08-31
        LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        // 7. 明天 -----打印输出----- 2019-08-08
        LocalDate tomorrowDay = localDate.plusDays(1L);
        // 8. 昨天 -----打印输出----- 2019-08-06
        LocalDate yesterday = localDate.minusDays(1L);
        // 9. 获取本年第12天 -----打印输出----- 2019-04-30
        LocalDate day = localDate.withDayOfYear(120);
        System.out.println(day);
        // 10. 计算两个日期间的天数
        long days = localDate.until(localDate1, ChronoUnit.DAYS);
        System.out.println(days);
        // 11. 计算两个日期间的周数
        long weeks = localDate.until(localDate1, ChronoUnit.WEEKS);
        System.out.println(weeks);

//        ---------------------  ，既包含日期，又包含时间，它经常和DateTimeFormatter一起使用
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(DateUtil.formatLocalDateTimeToString(localDateTime,"yyyy-MM-dd HH:mm:ss"));
//        ----------------------Clock  ---时钟
        // 系统默认
        Clock systemDefaultClock = Clock.systemDefaultZone();
        System.out.println("Current DateTime with system default clock: " + LocalDateTime.now(systemDefaultClock));
        System.out.println(systemDefaultClock.millis());

// 世界协调时UTC
        Clock systemUTCClock = Clock.systemUTC();
        System.out.println("Current DateTime with UTC clock: " + LocalDateTime.now(systemUTCClock));
        System.out.println(systemUTCClock.millis());

//芝加哥
        Clock clock = Clock.system(ZoneId.of(ZoneId.SHORT_IDS.get("CST")));
        System.out.println("Current DateTime with CST clock: " + LocalDateTime.now(clock));
    }
}

