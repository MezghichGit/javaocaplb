package plb_oca.chapter3.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		//1-Creation des date/time
		/*LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();*/
		LocalDate ld = LocalDate.of(2018, Month.APRIL, 1);
		
		//Period p = Period.ofDays(5);
		Period p = Period.of(2,2,10);
		ld = ld.plus(p);
		///ld = ld.plusDays(2);
		//ld.plusDays(2);
		System.out.println(ld);
		/*LocalTime lt = LocalTime.of(10,12);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		ld = ld.plusDays(-2);
		//ld = ld.plusMonths(-2);
		//System.out.println(ld);
		//System.out.println(ldt);*/
		
		// 3 -Formattage
		
		DateTimeFormatter monFormatMed = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter monFormatShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(ld.format(monFormatMed));
		System.out.println(ld.format(monFormatShort));
		
		LocalTime lt = LocalTime.now();
		//System.out.println(lt.format(monFormatMed));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(ldt.format(monFormatMed));
		System.out.println(ldt.format(f));
		System.out.println(f.format(ldt));

	}

}
