package com.mmm;

public class TryCatchEx {

	public static void main (String[]args)
	{
		int a = new TryCatchEx().absorbeTheValue();
		System.out.println(a);
	}

	int absorbeTheValue()
	{
		try
		{
			String s=null;
//			String s="robin";
			System.out.println(s.length());
			return 4;
		}
		catch(Exception e)
		{
//			return 45;
//			System.out.println("inside catch");
			return 45;
		}
		finally
		{
			System.out.println("inside finally");
			return 34;
		}
	} 

}
