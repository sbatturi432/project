package com.corejava;

public class Constructor {
     int i;
     int j;
     
	Constructor (int i,int j){
		System.out.println("1st");
	}
	
	
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		Constructor a=new Constructor(2,3);
	  
         a.add(2,3);
         a.sub(2,3);
        
          
	}void sub (int i,int j){
		System.out.println(i-j);
	}

}