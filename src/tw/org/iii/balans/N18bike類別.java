package tw.org.iii.balans;

public class N18bike類別 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();
		myBike.upSpeed(10);
		
		System.out.println(myBike.getSpeed());
	}

}
