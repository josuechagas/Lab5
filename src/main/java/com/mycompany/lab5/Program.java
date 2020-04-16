package com.mycompany.lab5;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of digits in the array: ");
		int len=sc.nextInt();
		int x[]=new int [len];
		System.out.println("Enter a array: ");
		for(int i=0;i<len;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Please enter x: ");
		int y=sc.nextInt();
		max(x,y);
	}
	public static void max(int x[],int y){
		System.out.println("All numbers greater than x are: ");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>y)
			{
				System.out.print(x[i]+" ");
			}
		}
		System.out.println();		
	}
}