package oopsConcept;

public class OverLodeingPro {

	public void print(Integer i)
	{
		System.out.println("INTEGER");
	}
	public void print(int i)
	{
		System.out.println("int");
	}
	public void print(long i)
	{
		System.out.println("long");
	}
	public void print(Long i)
	{
		System.out.println("Long");
	}
	public static void main(String[] args) {
		OverLodeingPro obj=new OverLodeingPro();
		obj.print(10000000000000000L);

	}

}
