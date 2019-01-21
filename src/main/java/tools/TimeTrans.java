package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeTrans {
    public static  String timeTrans(String d) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);
        Date d1= null;
        try {
            d1 = sdf.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(d1);
    }
    public static void main(String[] args) {
        String date = "Thu Dec 27 16:51:55 CST 2018";
        System.out.println(timeTrans(date));
    }
}
