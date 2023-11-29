package TypesofInheritance;


public class Inheritance {
	// Single Inheritance
	class Animal {
	    void eat() {
	        System.out.println("Animal is eating");
	    }
	}

	class Dog extends Animal {
	    void bark() {
	        System.out.println("Dog is barking");
	    }
	}

	// Multiple Inheritance (through Interfaces)
	interface Walkable {
	    void walk();
	}

	interface Swimmable {
	    void swim();
	}

	class Duck implements Walkable, Swimmable {
	    @Override
	    public void walk() {
	        System.out.println("Duck is walking");
	    }

	    @Override
	    public void swim() {
	        System.out.println("Duck is swimming");
	    }
	}

	// Multilevel Inheritance
	class Shape {
	    void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	class Circle extends Shape {
	    void draw() {
	        System.out.println("Drawing a circle");
	    }
	}

	class ColoredCircle extends Circle {
	    void drawWithColor() {
	        System.out.println("Drawing a colored circle");
	    }
	}

	// Hierarchical Inheritance
	class Vehicle {
	    void start() {
	        System.out.println("Vehicle is starting");
	    }
	}

	class Car extends Vehicle {
	    void drive() {
	        System.out.println("Car is driving");
	    }
	}

	class Bike extends Vehicle {
	    void ride() {
	        System.out.println("Bike is riding");
	    }
	}

	public class InheritanceExample {
	    public static void main(String[] args) {
	        // Single Inheritance
	        Dog myDog = new Dog();
	        myDog.eat();
	        myDog.bark();

	        // Multiple Inheritance
	        Duck myDuck = new Duck();
	        myDuck.walk();
	        myDuck.swim();

	        // Multilevel Inheritance
	        ColoredCircle coloredCircle = new ColoredCircle();
	        coloredCircle.draw();
	        coloredCircle.drawWithColor();

	        // Hierarchical Inheritance
	        Car myCar = new Car();
	        myCar.start();
	        myCar.drive();

	        Bike myBike = new Bike();
	        myBike.start();
	        myBike.ride();
	    }
	}

}
