package es.unileon.prg.date;
/**
 * Clase con el codigo para la creacion de una fecha 
 *
 * @author MARIA
 * @version 1.0
 */

public class Date {
	private int day;
	private int month;
	private int year;
	private String nombre;

	/**
	*Constructor el cual si se le pasa un argumento que se salga
	*de los parametros marcados hará que salga una DateException.
	*
	*-El año siempre será correcto
	*-El mes ha de estar entre el 1 y el 12, si no dirá que no es valido
	*-El día no puede ser <1 si no dirá que el día no es valido,
	*luego comprobará según el mes los días que puede tener 
	*/
	
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
				
				if(((year%400==0)||(year%4==0 && year%100!=0))&&day>29){
				throw new DateException("dia "+day+" no valido en el mes de febrero");
				}
				else if (day>28){
				this.day=day;
				}
			break;
			
			}
		}
}

/**
*Constructor de una fecha base para que luego se utilice en ciertos métodos.
*La fecha hace referencia al comienzo del año en el que nos encontramos
*/

public Date(){
	this.day=01;
	this.month=01;
	this.year=2019;	
	
	}

	/**
	*Constructor de la clase Date.
	*Permite la creación de nuevas fechas.

	*/
	public Date(Date fecha){
	
	}

	/**
	*Método que devuelve el año de la fecha introducida
	*/
	
	public int getYear(){
		return this.year;
	}
	/**
	*Método que devuelve el mes de la fecha introducida
	*/
	public int getMonth(){
		return this.month;
	}/**
	*Método que devuelve el día de la fecha introducida
	*/
	public int getDay(){
		return this.day;
	}
	
	/**
	*Devuelve el numero de dias que tiene el mes que se introduce en la fecha.
	*1,3,5,7,8,10,12 tienen 31.
	*4,6,9,11 tienen 30
	*2 dependiendo de si es un año bisiesto 29 o no 28

	*/	
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
				if((getYear()%400==0)||(getYear()%4==0 && getYear()%100!=0)){
				numDias=29;
			 }else{
				numDias=28;
			}
			
				break;
			}
	return numDias;	
}

	/**
	*Comprueba si dos fechas que se introducen en el main
	*pertenecen al mismo año. 
	*Con un if.
	*/

	public boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	/**
	*Comprueba si dos fechas que se introducen en el main
	*pertenecen al mismo año. 
	*Sin el if.
	*/
	public boolean isSameYear(Date another){
		boolean verdadero;
		verdadero=(this.year==another.getYear());
		return verdadero;
	}

	/**
	*Comprueba si dos fechas que se introducen en el main
	*pertenecen al mismo mes. 
	*Con el if.
	*/
	public boolean isSameMonthIf(Date another){
		if(this.month == another.getMonth()){
		return true;
		}
		return false;
	}

	/**
	*Comprueba si dos fechas que se introducen en el main
	*pertenecen al mismo mes. 
	*Sin el if.
	*/
	public boolean isSameMonth(Date another){
		boolean verdadero;
		verdadero=(this.month==another.getMonth());
		return verdadero;
	}

	/**
	*Comprueba si dos fechas que se introducen en el main
	*Son del mismo dia. 
	*Con el if.
	*/
	public boolean isSameDayIf(Date another){
		if(this.day==another.getDay()){
			return true;
		}
		return false;
	}

	/**
	*Comprueba si dos fechas que se introducen en el main
	*Son del mismo dia. 
	*Sin el if.
	*/
	public boolean isSameDay(Date another){
		boolean verdadero;
		verdadero=(this.day==another.getDay());
		return verdadero;
	}

	/**
	*Comprueba si dos fechas que se introducen en el main
	*Son del mismo dia, mes y año.. 
	*Con el if.
	*/
	public boolean isSameIf(Date another){
		if((this.year == another.getYear())&&(this.month == another.getMonth())&&(this.day==another.getDay())){
		return true;
		}
		return false;
	}
	/**
	*Comprueba si dos fechas que se introducen en el main
	*Son del mismo dia, mes y año.. 
	*Con el if.
	*/
	public boolean isSame(Date another){
		boolean verdadero;
		verdadero=((this.year==another.getYear())&&(this.day==another.getDay())&&(this.month==another.getMonth()));
		return verdadero;
	}

	/**
	*Método al que pasándole el número del mes que aparece en 		*la fecha introducida, lo convierte a String.
	*Es decir escribe el mes en el que se encuentra.
	

	*/

	public String getMonthName(){
	
		switch(getMonth()){
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

	/**

	*Método que devuelve la estación en la que nos encontramos 
	*según la fecha introducida.

	*/

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

	/**
	*Comprueba si el dia está correcto según el numero de dias
	*y el mes.
	*1,3,5,6,7,10,12 no pueden tener mas de 31 dias
	*4,6,9,11 no pueden tener mas de 30 días.
	*2 dependiendo de si es bisiesto o no podrá tener 28 o 29

	*/	
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

		if((((getYear()%400==0)||(getYear()%4==0 && getYear()%100!=0))&&this.day==29)||this.day<=28){
		
			switch(this.month){
			case 2:
				verificacion=true;
			break;
			}
		}

		return verificacion;
	}

	/**
	*Método que devuelve los nombres de los meses que quedan 	* para que se acabe el año.
	*Los va encadenando en un StringBuffer con el método 
	*.append() propio de la clase String 
	*/
	public String monthsLeft(){
		StringBuffer month=new StringBuffer();	
			for(int i=getMonth();i<=12;i++){
				month.append(getMonthName()+"\n");
				this.month=this.month+1;
			}
		return month.toString();
	}

	/**
	*Método que genera una fecha completa aleatorio que se 
	*utilizará posteriormente. 
	*La fecha está compuesta por un día, un mes y un año.
	

	*/


	public String randomDates(){
		StringBuilder date=new StringBuilder();
		
		date=date.append((int)(Math.random()*(31)+1)+" ");
		date=date.append((int)(Math.random()*(12)+1)+" ");
		date=date.append((int)(Math.random()*(20)+2018));
		
	return date.toString();
	}

	/**
	*Método que devuelve los días que quedan para que finalice
	*el mes. 
	*/
	
	
	public int getMonthDayLeft(){
			
		if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12){
			for(int i=this.day;i<=31;i++){
				System.out.print(i+" ");
			}
		}
		else if(this.month==4||this.month==6||this.month==9||this.month==11){
			for(int i=this.day;i<=30;i++){
				System.out.print(i+" ");
			}
		}
		else if(this.month==2){

			if((getYear()%400==0)||(getYear()%4==0 && getYear()%100!=0)){
			for(int i=this.day;i<=29;i++){
				System.out.print(i+" ");
			}
		}else{
			for(int i=this.day;i<=28;i++){
				System.out.print(i+" ");
			}
		}
		}
	return 0;
	
	}

	/**
	*Método que devuelve el nombre del mes según el número
	*que posee en la fecha introducida


	*/

	public int getMonthsSameDate(){
		for(int i=1;i<=12;i++){
			if(this.month==1||this.month==3||this.month==5||this.month==7||this.month==8||this.month==10||this.month==12){
				switch(i){
					case 1:
					System.out.println("enero");
					break;
					case 3:
					System.out.println("marzo");
					break;
					case 5:
					System.out.println("mayo");
					break;
					case 7:
					System.out.println("julio");
					break;
					case 8:
					System.out.println("agosto");
					break;
					case 10:
					System.out.println("octubre");
					break;
					case 12:
					System.out.println("diciembre");
					break;
				}
			}
		else if(this.month==4||this.month==6||this.month==9||this.month==11){
			switch(i){
			case 4:
			System.out.println("abril");
			break;
			case 6:
			System.out.println("junio");
			break;
			case 9:
			System.out.println("septiembre");
			break;
			case 11:
			System.out.println("noviembre");
			}
		}
		else if(this.month==2){
			switch(i){
			case 2:
			System.out.println("febrero");
			break;
			}
		}
		}
	return 0;	
	}

	/**
	*Método que cuenta los días que han pasado desde el 1 de 
	*enero de ese mismo año hasta la fecha.

	*/
	public int dayPast(){
		int suma=0;
		int mes_31=31;	
		int mes_30=30;
		int mes_2=28;
		int numDias=0;

		if((getYear()%400==0)||(getYear()%4==0 && getYear()%100!=0)){
				mes_2=29;
			 }else{
				mes_2=28;
			}
			switch(getMonth()){
				case 1:
				suma=this.day;
				break;
				case 2:
				suma=this.day+mes_31;
				break;
				case 3:
				suma=this.day+mes_31+mes_2;
				break;
				case 4:
				suma=this.day+mes_31*2+mes_2;
				break;
				case 5:
				suma=this.day+mes_31*2+mes_2+mes_30;
				break;
				case 6:
				suma=this.day+mes_31*3+mes_2+mes_30;
				break;
				case 7:
				suma=this.day+mes_31*3+mes_2+mes_30*2;
				case 8:	
				suma=this.day+mes_31*4+mes_2+mes_30*2;
				case 9:
				suma=this.day+mes_31*4+mes_2+mes_30*3;
				break;
				case 10:
				suma=this.day+mes_31*5+mes_2+mes_30*3;
				break;
				case 11:
				suma=this.day+mes_31*5+mes_2+mes_30*4;
				case 12:
				suma=this.day+mes_31*6+mes_2+mes_30*4;
				break;
			}
	return suma;
			
		
	}

	/**
	*Método que cuenta al generar una fecha aleatoria el número de 
	*intentos que se llevarían a cabo hasta conseguir la fecha 	*introducida

	*Usa solo while().
	*/
	public int numRandomTimesEqualDate1(){
		int numIntentos=0;
		boolean acierto=false;
		int numAcertar1=this.day;
		int numAcertar2=this.month;
			while(!acierto){
				int diaR=(int)(Math.random()*31+1);
				int mesR=(int)(Math.random()*12+1);
				if(diaR==numAcertar1&&mesR==numAcertar2){
				acierto=true;
				}
				else if(diaR!=numAcertar1||mesR!=numAcertar2){
			numIntentos++;	
				}
			}
		System.out.print("numero de intentos: ");
		return numIntentos;
		}

		/**
	*Método que cuenta al generar una fecha aleatoria el número de 
	*intentos que se llevarían a cabo hasta conseguir la fecha 	*introducida

	*Usa do - while().
	*/
	
	public int numRandomTimesEqualDate2(){
		int numIntentos=0;
		boolean acierto=false;
			do{
				int diaR=(int)(Math.random()*31+1);
				int mesR=(int)(Math.random()*12+1);
				
				if(diaR==this.day&&mesR==this.month){
					acierto=true;
				}
				else if(diaR!=this.day||mesR!=this.month){
					numIntentos++;
				}	
			}while(!acierto);
		return numIntentos;
	}
	
	/**
	*Método que devuelve el día de la seman a de la fecha 	*introducida
	*/

	public String dayOfWeek(){
		String day=" ";
		int dia=dayPast();
		if(dia%7==1){
			day="tuesday";
		}
		else if(dia%7==2){
			day="wednesday";
		}
		else if(dia%7==3){
			day="thursday";
		}
		else if(dia%7==4){
			day="friday";
		}
		else if(dia%7==5){
			day="saturday";
		}
		else if(dia%7==6){
			day="sunday";
		}
		else if(dia%7==0){
			day="monday";
		}
	return day.toString();
}


public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
}

}
