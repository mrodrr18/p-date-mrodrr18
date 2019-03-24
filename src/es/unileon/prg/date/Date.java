package es.unileon.prg.date;

public class Date {
	private int day;
	private int month;
	private int year;
	private String nombre;
	
	public Date(int day, int month, int year)throws DateException{

		this.year=year;

		if(month<1||month>12){

			throw new DateException("mes "+month+" no valido "+"valores posibles entre 1 y 12");
		}
		else{

			this.month=month;
		}

		if(day<1){
		throw new DateException("dia "+day+ " no valido "+" solo se pueden dias mayores que 1");
		}
		else{
			switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day>31){
				throw new DateException("dia "+day+" no valido en este mes");
				}
				else{
				this.day=day;
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>30){
				throw new DateException("dia "+day+" no valido en este mes");
				}
				else{
				this.day=day;
				}
			break;
			case 2:
				if(day>28){
				throw new DateException("dia "+day+" no valido en el mes de febrero");
				}
				else{
				this.day=day;
				}
			break;
			
			}
		}
}

public Date(){
	this.day=23;
	this.month=03;
	this.year=2019;	
	
	}
	public Date(Date fecha){
	
	}
	
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	private int getMonths(){
		int months=this.month;
		return months;
	}
	public int getDay(){
		return this.day;
	}
	int getDays(){
	int day=0;
	switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				for(int i=this.day;i<=31;i++){
				day=this.day;
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				for(int i=this.day;i<=30;i++){	
				day=this.day;
				}
			break;
			case 2:
				for(int i=this.day;i<=28;i++){
				day=this.day;
				}
			break;
		
	
	}
		return day;
	}
	int numDate(){
	int numDias=0;
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			numDias=31;
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			numDias=30;
			break;
			case 2:
			numDias=28;
			break;
			}
	return numDias;	
}

public boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}
	public boolean isSameYear(Date another){
		boolean verdadero;
		verdadero=(this.year==another.getYear());
		return verdadero;
	}
	public boolean isSameMonthIf(Date another){
		if(this.month == another.getMonth()){
		return true;
		}
		return false;
	}
	public boolean isSameMonth(Date another){
		boolean verdadero;
		verdadero=(this.month==another.getMonth());
		return verdadero;
	}
	public boolean isSameDayIf(Date another){
		if(this.day==another.getDay()){
			return true;
		}
		return false;
	}
	public boolean isSameDay(Date another){
		boolean verdadero;
		verdadero=(this.day==another.getDay());
		return verdadero;
	}
	public boolean isSameIf(Date another){
		if((this.year == another.getYear())&&(this.month == another.getMonth())&&(this.day==another.getDay())){
		return true;
		}
		return false;
	}
	public boolean isSame(Date another){
		boolean verdadero;
		verdadero=((this.year==another.getYear())&&(this.day==another.getDay())&&(this.month==another.getMonth()));
		return verdadero;
}

public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
}

}
