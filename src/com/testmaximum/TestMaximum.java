package com.testmaximum;

public class TestMaximum<T extends Comparable<T>> {
	T x, y, z;

	public TestMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return TestMaximum.testMax(x, y, z);
	}

	public static void main(String[] args) {
		//Defines three integer values
		Integer number1 = 2;
		Integer number2 = 3;
		Integer number3 = 5;
		//Defines three float values 
		Float num1 = 4.5f;
		Float num2 = 1.1f;
		Float num3 = 2.19f;
		//Defines three string values
		String name1 = "Apple";
		String name2 = "Peach";
		String name3 = "Banana";

		TestMaximum<Integer> printMaxInteger = new TestMaximum<Integer>(number1, number2, number3);
		printMaxInteger.maximum(); //returns the maximum integer value
		TestMaximum<Float> printMaxFloat = new TestMaximum<Float>(num1, num2, num3);
		printMaxFloat.maximum(); //returns the maximum float value
		TestMaximum<String> printMaxString = new TestMaximum<String>(name1, name2, name3);
		printMaxString.maximum(); //returns the maximum string value

	}
	//Determines the largest of 3 comparable objects
	public static <T extends Comparable<T>> T testMax(T x, T y, T z) {

		T maximum = x; //assume x is the largest among 3
		if (y.compareTo(maximum) > 0) {
			maximum = y; //y is largest so far
		}
		if (z.compareTo(maximum) > 0) {
			maximum = z; //z is largest now
		}
		printMax(x, y, z, maximum);
		return maximum; //returns the macimum value
	}

	public static <T> void printMax(T x, T y, T z, T maximum) {
		System.out.printf("Max of %s,%s and %s is %s \n ", x, y, z, maximum);
	}
}