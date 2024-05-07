/**
 * Lab 10 Car class
 * @author Carson Triplett
 *
 */
 
 public class Car extends Vehicle {
 	 
 	 private int doors;
 	 private int passengers;
 	 
 	 public Car(String aMake, String aModel, String aPlate, int numDoors, int numPassengers) {
 	 	 super(aMake, aModel, aPlate);
 	 	 this.doors = numDoors;
 	 	 this.passengers = numPassengers;
 	 }
 	 
 	 public int getDoors() {
 	 	 return this.doors;
 	 }
 	 
 	 public int getPassengers() {
 	 	 return this.passengers;
 	 }
 	 
 	 @Override
 	 public String toString() {
 	 	 int theDoors = this.getDoors();
 	 	 String aMake = this.getMake();
 	 	 String aModel = this.getModel();
 	 	 String aPlate = this.getPlate();
 	 	 String result = String.format("%d-door %s %s with license %s.\n", 
 	 	 	 theDoors, aMake, aModel, aPlate);
 	 	 return result;
 	 }
 	 
 	 @Override
 	 public boolean equals(Object other) {
		if(!(other instanceof Car)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.doors == otherCar.doors) {
			if(this.passengers == otherCar.passengers) {
				if(super.equals(otherCar)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public Car copy() {
		int theDoors = this.getDoors();
		int thePassengers = this.getPassengers();
		String aMake = this.getMake();
		String aModel = this.getModel();
		String aPlate = this.getPlate();
		Car theCopy = new Car(aMake, aModel, aPlate, theDoors, thePassengers);
		return theCopy;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("Honda", "Civic", "BINARY", 2, 1);
		System.out.println(myCar);
	}
 }
 