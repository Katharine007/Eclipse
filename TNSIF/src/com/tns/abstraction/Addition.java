package com.tns.abstraction;

public class Addition extends MyTest{
	@Override
	int cal() {
		// TODO Auto-generated method stub
		int a=10;
		int b=50;
		return a+b;
	}
    
	void show() {
		System.out.println("Inside show method of Addition");
	}
    public static void main(String[] args) {
    	Addition obj = new Addition();
    	obj.display();
    	obj.show();
    	System.out.println("Result = "+ obj.cal());
    }
}

