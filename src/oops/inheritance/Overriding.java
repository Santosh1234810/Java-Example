package oops.inheritance;

class Bank
{
	int RateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int RateOfInterest()
	{
		return 10;
	}
}

class ICICI extends Bank
{
	int RateOfInterest()
	{
		return 12;
	}
}

class Axis extends Bank
{
	int RateOfInterest()
	{
		return 13;
	}
}

public class Overriding {
	public static void main(String a[]) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.RateOfInterest());
		
		ICICI icici = new ICICI();
		System.out.println(icici.RateOfInterest());
		
		Axis axis  = new Axis();
		System.out.println(axis.RateOfInterest());
	}
}
