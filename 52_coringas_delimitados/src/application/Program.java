package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	public static void main(String[] args) {
//		List<Shape> myShapes = new ArrayList<>();
//		myShapes.add(new Rectangle(3.0, 2.0));
//		myShapes.add(new Circle(2.0));
//		
//		totalArea(myShapes);
//		
//		List<Circle> myCircles = new ArrayList<>();
//		
//		myCircles.add(new Circle(2.5));
//		myCircles.add(new Circle(9.5));
//		
//		totalArea(myCircles);
		
// 		Covariância: operação get é permitida, mas put não
		
//		List<Integer> intList = new ArrayList<Integer>();
//		intList.add(4);
//		intList.add(8);
//		
//		List<? extends Number> list = intList;
//		
//		Number x = list.get(0); // OK
//		list.add(20);  //  ERROR
		
//		Contravariância
		
//		List<Object> myObjs = new ArrayList<Object>();
//		myObjs.add(20);
//		myObjs.add(30);
//		
//		List<? super Number> myNums = myObjs;
//		myNums.add(30);
//		myNums.add(3.14);
//		
//		Number x = myNums.get(0);
		
		List<Integer> myInt = Arrays.asList(1, 2, 4, 8);
		List<Double> myDouble = Arrays.asList(2.0, 4.0, 8.0, 16.0);
		List<Object> myObj = new ArrayList<Object>();
		
		copyAndPrint(myInt, myObj);
		copyAndPrint(myDouble, myObj);
		
	}

//	public static double totalArea(List<Shape> shapes) {
//		double sum = 0.0;
//		for (var shape : shapes) {
//			sum += shape.area();
//		}
//		System.out.println("Soma: " + sum);
//		return sum;
//	}
	public static void copyAndPrint(List<? extends Number> input, List<? super Number> output) {
		for(var number : input) {
			output.add(number);
		}
		for(var number : output) {
			System.out.print(number + " ");
		}
		System.out.println("");
	}
	public static double totalArea(List<? extends Shape> shapes) {  // a lista pode ser de qualquer sub tipo de shape
		double sum = 0.0;
		for (var shape : shapes) {
			sum += shape.area();
		}
		System.out.println("Soma: " + sum);
		return sum;
	}
}
