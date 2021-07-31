package com.simplilearn.arrays;

public class StringArrayExample {

	public static void main(String[] args) {
		
		String[] names = {"John","Mike","David", "William","Tony"};
		
		System.out.println("Name ate index 0 : "+names[0]);
		// System.out.println("Name ate index 5 : "+names[5]);  //ArrayIndexOutOfBoundsException

		for(int index=0; index < names.length ; index++) {
			System.out.println("Name at index : "+index +" name "+names[index]);
		}
	}

}
