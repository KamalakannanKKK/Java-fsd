package Project17;
import java.util.*;
class Vehicle{
	int gear;
	int speed;

	public Vehicle(int gear2, int speed2) {
		this.gear=gear;
		this.speed=speed;
	}



	public  String toString(){
		return("The gear is  "+gear+"and speed is  "+speed );
	}
}
class bike  extends Vehicle{
	int seatheight;
	public bike(int gear, int speed, int seatheight) {
        super(gear,speed);
        this.seatheight=seatheight;
    
	}
	@Override
	public String toString(){
		return(super.toString()+"and the seat height"+seatheight);
	}
	
}
public class inheritance {

	public static void main(String[] args) {
		bike b=new bike(3,556,7);
		System.out.println(b.toString());
		
	}

}
