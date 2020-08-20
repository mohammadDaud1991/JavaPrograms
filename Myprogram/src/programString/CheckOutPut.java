package programString;

public class CheckOutPut {

	public static void main(String[] args) {
		String s1="daud";
		String s2=new String("daud");
		s2=s2.intern();
		System.out.println("Its Return True Because both object address is same in String pool=="+s1==s2);

	}

}
