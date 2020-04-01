package collectionsDemo;

import java.util.ArrayList;
import java.util.List;
class Car { }
class Suzuki extends Car { }
public class CarDealer {
//	public void addCar(List<Car> cars) {
	public void addCar(List<Suzuki> cars) {
//		cars.add(new Suzuki());
		System.out.println("Inside add car");

	}
	public static void main(String[] args) {
		List<Suzuki> cars = new ArrayList<Suzuki>();
//		List<Car> cars = new ArrayList<Car>();

		cars.add(new Suzuki());
		cars.add(new Suzuki());
		
//		CarDealer  carDealerIndia = new CarDealer();
//		carDealerIndia.addCar(cars);
		
		CarDealer  carDealerUS = new CarDealer();
		carDealerUS.addCar(cars);

	}
}

