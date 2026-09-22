package myapp;

public class Student {

	public static void main(String[] args) {
		
//  condition? valueIfTrue : valueIfFalse;
		double coursework_mark = 50;
		
		String results = coursework_mark>=50? "Passed" : "Failed";
		
		System.out.println(results);
		
		// for(initialization; condition; update) {
		//code to execute;
	//}
	
	for(int i =1; i<=7; i++) {
		System.out.println(i);
	}
	
	//do {
	//}while();
	
	int i =1;
	
	do {
		System.out.println(i);
		i++;
	}while(i<=7);
	
	boolean registered = true;
	int marks = 50;
	
	if(registered == true) {
		
		if(marks >=50) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	} else {
		System.out.println("student is not registered");
	}
	
	}
	}


