package nl.dstibbe.explortation.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.junit.Assert;
import org.junit.Test;

public class DateTest {

    @Test
    public void testEvaluateDate() {
        DateFormat cetFormat = new SimpleDateFormat();
        cetFormat.setTimeZone(TimeZone.getTimeZone("CET"));

        //Set the system timezone to Palau (+09:00)
        System.setProperty("user.timezone", "Pacific/Palau");
        TimeZone.setDefault(null);

        Date dateInPalau = new Date();
        System.out.println("Palau formatted date: " + dateInPalau);
        System.out.println("Palau timestamp (rel to epoch): " + dateInPalau.getTime());
        System.out.println("Palau formatted date (CET): " + cetFormat.format(dateInPalau));

        //Set the system timezone to Palau (-04:00)
        System.setProperty("user.timezone", "America/Antigua");
        TimeZone.setDefault(null);

        Date dateInAntigua = new Date();
        System.out.println("Antigua formatted date: " + dateInAntigua);
        System.out.println("Antigua timestamp (rel to epoch): " + dateInAntigua.getTime());
        System.out.println("Antigua formatted date (CET): " + cetFormat.format(dateInAntigua));

        Assert.assertEquals("Dates are not equal", dateInPalau.getTime() / 1000, dateInAntigua.getTime() / 1000);

    }

}
