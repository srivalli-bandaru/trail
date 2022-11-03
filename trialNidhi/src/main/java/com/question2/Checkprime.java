package com.question2;

public class Checkprime {
	
	public boolean check(int a) {
		if (a%2 == 0) {
			return false;
			
		}
		return true;
	}
public static void main(String args[]) {
	Checkprime p = new Checkprime();
	System.out.println(p.check(3));
}
}
