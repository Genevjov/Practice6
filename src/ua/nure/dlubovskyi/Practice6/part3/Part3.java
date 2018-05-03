package ua.nure.dlubovskyi.Practice6.part3;

public class Part3 {

	public static void main(String[] args) {
		Car bently = new Car("AX0777");
		Parking parking = new Parking(20);
		parking.parkCar(4, bently);
		System.out.println(parking);
		parking.leaveParking(bently);
		System.out.println(parking);
	}

}
