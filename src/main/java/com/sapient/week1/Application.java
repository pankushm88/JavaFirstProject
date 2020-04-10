package com.sapient.week1;
public class Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	CheckEven Ceven= new CheckEven();
	int n;
	public Boolean a=Ceven.check(n);
}
class CheckEven
{
	CheckEven()
	{
		
	}
    public Boolean check(int n)
    {
        Boolean result=false;
        if(n%2==0)
        {
            result= true;
        }
        return result;
    }
}
