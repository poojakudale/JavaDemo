package com.simplilearn.modifierdemo;

public class Modifier {
	
	public int x = 10;
	private int y = 20;
	protected int z = 100;
	int m = 12;
	
	public void access()
	{
		System.out.println(x+" "+y+" "+z+" "+m);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier md = new Modifier();
		md.access();
	}

}
