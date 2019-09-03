package MyOwnAutoShop;

class Car {
	int speed;
	double regularPrice;
	String color;

	Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	double getSalePrice() {
		return regularPrice;
	}
}

class Truck extends Car {
	int weight;

	Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	double getSalePrice() {
		if (weight > 2000) {
			return super.regularPrice * 0.9;
		} else {
			return super.regularPrice * 0.8;
		}
	}
}

class Sedan extends Car {
	int length;

	Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	double getSalePrice() {
		if (length > 20) {
			return super.regularPrice * 0.95;
		} else {
			return super.regularPrice * 0.9;
		}
	}

}

class Ford extends Car {
	int year;
	int manufacturerDiscount;

	Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.manufacturerDiscount = manufacturerDiscount;
		this.year = year;
	}

	double getSalePrice() {
		return super.regularPrice*(100 - manufacturerDiscount)/100;
	}

}

class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan1 = new Sedan(110, 260000, "Soul-silver", 60);
		Ford ford1 = new Ford(130, 120000, "Hot-Red", 2018, 10);
		Ford ford2 = new Ford(150, 240000, "White", 2019, 5);
		Truck truck1 = new Truck(80, 120000, "Black", 3500);
		Car car1 = new Car(19, 15000, "Yellow");
		System.out.println("Price of car: Rs." + car1.getSalePrice());
		System.out.println("Price of Truck: Rs." + truck1.getSalePrice());
		System.out.println("Price of Ford (model 2018): Rs." + ford1.getSalePrice());
		System.out.println("Price of Ford (model 2019): Rs." + ford2.getSalePrice());
		System.out.println("Price of Sedan: Rs." + sedan1.getSalePrice());
	}

}