package com.cts;

public class GenralAPI {
	public int add(int a,int b)
	{
		return a+b;
	}
public boolean checkEven(int num)
{
	if(num%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public int getFactorial(int num)
{
	if(num==1)
		return 1;
	return num*getFactorial(num-1);
}
public boolean checkPrime(int num)
{
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	return false;
	
}

}
