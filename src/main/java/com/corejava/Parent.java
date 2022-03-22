package com.corejava;

public class Parent {
    public void display(int i) {
    	System.out.println("Result is " + i);
    }
    
    public int add(int i, int j) {
    	return i+j+10;
    }
    
    public static void main(String[] args) {
    	Parent p = new Parent();
    	child1 c1 = new child1();
    	child2 c2 = new child2();
    	
    	int j = p.add(10, 10);
    	int k = c1.add(10, 10);
    	int l = c2.sub(10,  10);
    	int m = c2.add(10, 10);
    	
    	p.display(j);
    	c1.display(k);
    	c2.display(l);
    	c2.display(m);
    }
}

class child1 extends Parent{

	public int add(int i, int j) {
		return i+j;
	}
}

class child2 extends Parent{

	public int sub(int i, int j) {
		return i-j;
	}
	
	public int add(int i, int j) {
		return i*j;
	}
}