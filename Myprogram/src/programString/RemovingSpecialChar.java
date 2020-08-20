package programString;

public class RemovingSpecialChar {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer();
	StringBuffer ss=new StringBuffer("@[]{}Daud#\"mohammad");
	String special="!@#$%&*()_-+=|[].{}:;\"<>,?/1234567890`''";
	StringBuffer sb1=new StringBuffer();
	StringBuffer sb2=new StringBuffer("Daud");
		/*
		 * System.out.println(sb1.equals(sb2)); System.out.println(sb1==sb2);
		 */
	System.out.println(sb1.toString().equals(""));
	System.out.println(sb2);
}
}
