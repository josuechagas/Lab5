package com.mycompany.lab5;

import java.util.Scanner;

public class TestScores {
    static double []score;
	static int x;
	public TestScores(double[] score, int y) {
		super();
		this.score = score;
		this.x = y;
	}
	static double average()
	{
		int sum=0;
		for(int i=0;i<x;i++)
		{
			sum+=score[i];
		}
		double avg=sum*1.0/x;
		return avg;
	}
	public double[] gscore() {
		return score;
	}
	public void sscore(double[] score) {
		this.score = score;
	}
	public int gy() {
		return x;
	}
	public void sy(int y) {
		this.x = y;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of scores:");
		int n=sc.nextInt();
		double a[]=new double[n];
		System.out.println("Enter the score");
		int f=1;
		try
		{
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextDouble();
				if(a[i]<0||a[i]>100)
				{
					f=0;
					throw new Exception("Invalid, the score can't vbe negative or bigger than 100");		
				}
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		if(f==1)
		{
			TestScores ts=new TestScores(a, n);
			System.out.println("The average test score:"+ts.average());
		}
	}
}