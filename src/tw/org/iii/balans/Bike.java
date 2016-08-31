package tw.org.iii.balans;

public class Bike {
	private double Speed;
	
	//建構式
	private int color;
	Bike (){
		System.out.println("Bike()");
		color = 2 ;
	}
	//同名異式
	Bike (int c){
		System.out.println("Bike(int)");
		color = c ;
	}
	
	void upSpeed(){
		Speed = (Speed<1?1:Speed*1.2);
	}
	//同名異式
	void upSpeed(int gear){
		Speed = (Speed<1?1:Speed*(1.2+gear));
	}
	void downSpeed(){
		Speed = (Speed<1?0:Speed*0.6);
	}
	double getSpeed(){
		return  Speed ;
	}
	
}
