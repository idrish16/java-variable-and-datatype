package com.variable;
//varible = it is a memory block that store a data.
//Ex:- int a = 10;  int is a data type , a is a variable name, 10 is a value.

//Datatye is define the type of data and which type of data you can store.
//tpye of datatype.
//1. primitive Datatpye.
//2. non primitive datatype.
//
//1. primtive Datatpyes [8]
//		1. byte     
//		2. int
//		3. short
//		4. long
//		5. float
//		6. double
//		7. boolean
//		8. char

//A Wrapper Class in Java is a class that converts a primitive data type into an object.

public class Variables {
	
	public static void main(String[] args) {
		
		System.out.println("Byte size: " + Byte.SIZE + " bits");
        System.out.println("Short size: " + Short.SIZE + " bits");
        System.out.println("Int size: " + Integer.SIZE + "bits");
        System.out.println("Long size: " + Long.SIZE + " bits");
        System.out.println("Float size: " + Float.SIZE + " bits");
        System.out.println("Double size: " + Double.SIZE + " bits");
        System.out.println("Char size: " + Character.SIZE + " bits");
        System.out.println("");
        System.out.println("");
        
//		  System.out.println("Byte size: " + Byte.BYTES + " bytes");
//        System.out.println("Short size: " + Short.BYTES + " bytes");
//        System.out.println("Int size: " + Integer.BYTES + " bytes");
//        System.out.println("Long size: " + Long.BYTES + " bytes");
//        System.out.println("Float size: " + Float.BYTES + " bytes");
//        System.out.println("Double size: " + Double.BYTES + " bytes");
//        System.out.println("Char size: " + Character.BYTES + " bytes");
		
        System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Char Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

	}
	

}
