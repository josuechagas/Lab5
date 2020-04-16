package com.mycompany.lab5;

public class TestData {
    public static void main(String[] args) {
		int[] a={10,20,30,40,50,60,70,80,90,100};
		int sum=getTotal(a);
		double ave=getAverage(a);
		int max=getHighest(a);
		int min=getLowest(a);
                System.out.println("Total:"+sum);
		System.out.println("Average:"+ave);
		System.out.println("Highest:"+max);
		System.out.println("Lowest:"+min);
	}
	static int getTotal(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	static double getAverage(int x[])
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum+=x[i];
		}
		double ave=sum*1.0/x.length;
		return ave;
	}
	static int  getHighest(int x[])
	{
		int m=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(m<x[i]){
				m=x[i];
			}
		}
		return m;
	}
	static int  getLowest(int x[])
	{
		int m=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(m>x[i]){
				m=x[i];
			}
		}
		return m;
	}
}