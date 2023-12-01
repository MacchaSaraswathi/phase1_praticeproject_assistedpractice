package ClassesObjectsConstructors;

public class ClassesObjectsConstructors { 
	
	  // Custom class inheriting from Object implicitly
    static class MyClass {
        private int value;

        // Constructor
        public MyClass(int value) {
            this.value = value;
        }

        // Custom method
        public void display() {
            System.out.println("Value: " + value);
        }
    }

    public static void main(String[] args) {
        // Creating an object of the custom class
        MyClass myObject = new MyClass(42);

        // Using the custom method
        myObject.display();

        // Accessing Object class methods
        // toString() method
        System.out.println("Object class toString(): " + myObject.toString());

        // hashCode() method
        System.out.println("Object class hashCode(): " + myObject.hashCode());

        // getClass() method
        System.out.println("Object class getClass(): " + myObject.getClass());

        // equals() method
        MyClass anotherObject = new MyClass(42);
        System.out.println("Object class equals(): " + myObject.equals(anotherObject));
    }
}

	
	