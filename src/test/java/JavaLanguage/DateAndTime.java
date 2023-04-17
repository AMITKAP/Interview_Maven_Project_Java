package JavaLanguage;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DateAndTime
{


      @Test
      public void dateAndTimeAPI()
      {

          LocalDate ldt=LocalDate.of(1981, Month.JANUARY,13);
          System.out.println(LocalDate.now());
          System.out.println(LocalDateTime.now());
          System.out.println(LocalDate.of(1981, Month.JANUARY,13));
          ldt.plusDays(1);
          Period.between(ldt,ldt);
      }

}
