package programString;
class A{
	
	void meth(int i, int j)
	{
		j *=2;
		j /=2;
		System.out.println(j);
	}
}
public class Assignmentoperator {

	public static void main(String[] args) {
		int a=15;
		int b=20;
		System.out.println("A AND B VALUE===A==="+a+"  B=   "+b);
A aa=new A();
aa.meth(a, b);
System.out.println(a+"   "+b);
	}

}
