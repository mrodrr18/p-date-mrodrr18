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
	this.day=01;
	this.month=01;
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

public String getMonthName(){
	
		switch(getMonths()){
			case 1:
				nombre="enero";
			break;
			case 2:
				nombre="febrero";
			break;
			case 3:
				nombre="marzo";
			break;
			case 4:
				nombre="abril";
			break;
			case 5:
				nombre="mayo";
			break;
			case 6:
				nombre="junio";
			break;
			case 7:
				nombre="julio";
			break;
			case 8:
				nombre="agosto";
			break;
			case 9:
				nombre="septiembre";
			break;
			case 10:
				nombre="octubre";
			break;
			case 11:
				nombre="noviembre";
			break;
			case 12:
				nombre="diciembre";
			break;
		}
		return nombre;
				
}

public String getMonthSeason(){
		String estacion=" ";
		switch(this.month){
		case 1:
		case 2:
			estacion="invierno";
		break;
		case 3:
			if(this.day>1&&this.day<=20){
				estacion="invierno";
			}
			else if(this.day>20&&this.day<=31){
				estacion="primavera";
			}
		break;
		case 4:
		case 5:
			estacion="primavera";
		break;
		case 6:
			if(this.day>1&&this.day<=20){
				estacion="primavera";
			}
			else if(this.day>20&&this.day<=30){
				estacion="verano";
			}
		break;
		case 7:
		case 8:
			estacion="verano";
		break;
		case 9:
			if(this.day>1&&this.day<=20){
				estacion="verano";
			}
			else if(this.day>20&&this.day<=30){
				estacion="otoño";
			}
		break;
		case 10:
		case 11:
			estacion="otoño";
		break;
		case 12:
			if(this.day>1&&this.day<=20){
				estacion="otoño";
			}
			else if(this.day>20&&this.day<=31){
				estacion="invierno";
			}
		break;
		}
	return estacion;
}
public boolean isDayRight(){
		boolean verificacion=false;
		if(this.day<=31){
			switch(this.month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					 verificacion=true;
			break;
			}
		}
		if(this.day<=30){
			switch(this.month){
			case 4:
			case 6:
			case 9:
			case 11:
				verificacion=true;
			break;
			}
		}
		if(this.day<=28){
			switch(this.month){
			case 2:
				verificacion=true;
			break;
			}
		}
	return verificacion;
}
public String monthsLeft(){
	StringBuffer month=new StringBuffer();	
		for(int i=getMonths();i<=12;i++){
		month.append(getMonthName()+"\n");
		this.month=this.month+1;
		}
	return month.toString();
	}


public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
}

}
