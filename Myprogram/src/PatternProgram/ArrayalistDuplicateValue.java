package PatternProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayalistDuplicateValue {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(1); al.add(2);al.add(4);al.add(3);al.add(5);al.add(4);al.add(2);al.add(5);al.add(5);al.add(3);al.add(5);
		System.out.println("ArrayList=="+al);
		int count =0;
		Set all=new HashSet();
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					count +=1;
				}
			}
			all.add("ArrayList Element>"+al.get(i)+" == "+count+" Time  ");
			count=0;
		}
		al.removeAll(al);
		al.add(all);
		System.out.println(al);
	}

}
