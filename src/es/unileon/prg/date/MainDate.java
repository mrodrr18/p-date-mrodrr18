package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today, tomorrow;

		try {
			today = new Date(24, 03, 2019);
			System.out.println(today.toString());
			tomorrow = new Date(25, 3, 2019);
		System.out.println(today.toString());
		System.out.println(tomorrow.toString());
		System.out.println(today + " isSameYearIf " + tomorrow + "? " + today.isSameYearIf(tomorrow));
		System.out.println(today + "isSameYear"+tomorrow+"?"+today.isSameYear(tomorrow));
		System.out.println(today + "isSameMonthIf"+tomorrow+"?"+today.isSameMonthIf(tomorrow));
		System.out.println(today + "isSameMonth"+tomorrow+"?"+today.isSameMonth(tomorrow));
		System.out.println(today + "isSameDayIf"+tomorrow+"?"+today.isSameDayIf(tomorrow));
		System.out.println(today + "isSameDay"+tomorrow+"?"+today.isSameDay(tomorrow));
		System.out.println(today + "isSameIf"+tomorrow+"?"+today.isSameIf(tomorrow));
		System.out.println(today + "isSame"+tomorrow+"?"+today.isSame(tomorrow));
		
		
		System.out.println(today.getMonthDayLeft());
		System.out.println(today.getMonthSeason());
		System.out.println(today.isDayRight());
		System.out.println(today.getMonthsSameDate());
		System.out.println(today.dayPast());
		System.out.println(today.numRandomTimesEqualDate1());
		System.out.println(today.numRandomTimesEqualDate2());
		System.out.println(today.randomDates());
		System.out.println(today.dayOfWeek());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
