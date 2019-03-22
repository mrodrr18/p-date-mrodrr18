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

public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
}
}
