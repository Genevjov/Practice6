package ua.nure.dlubovskyi.Practice6.part3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class Parking {
	private int capacity;
	private ArrayList<Car> park;

	public Parking(int capacity) {
		this.capacity = capacity;
		park = new ArrayList<>();
		createPark();

	}

	private void createPark() {
		for (int i = 0; i < capacity; i++) {
			park.add(i, null);
		}
	}

	public boolean parkCar(int number, Car car) {
		if (((park.contains(null)) && !park.contains(car) && !Objects.isNull(car))
				&& (number >= 0 && number < park.size())) {
			for (int i = number + 1; i < capacity; i++) {
				if (Objects.isNull(park.get(i))) {
					park.set(i, car);
					return true;
				}

			}
		}
		return false;
	}

	public boolean leaveParking(Car car) {
		if (park.contains(car) && !Objects.isNull(car)) {
			ListIterator<Car> iterator = park.listIterator();
			while (iterator.hasNext()) {
				if (!Objects.isNull(iterator.next())) {
					iterator.set(null);
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public String toString() {
		int freePlaces = 0;
		int occupiedPlaces = 0;
		for (Car car : park) {
			if (Objects.isNull(car)) {
				freePlaces++;
			} else {
				occupiedPlaces++;
			}
		}
		return "Free places: " + freePlaces + "\nOccupied places: " + occupiedPlaces;
	}
}