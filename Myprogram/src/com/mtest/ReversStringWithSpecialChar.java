package com.mtest;

import java.util.*;
public class ReversStringWithSpecialChar 
{
	public static void main(String args[]) 
	{
		Map<Integer, String> m=new HashMap<>();
		String s="@Dau#d";
		System.out.println(s);
		List ls=new ArrayList();
		Map<Integer,Character> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				ls.add(s.charAt(i));
			}
			else {
				map.put(i,s.charAt(i));
			}
		}
		 Collections.reverse(ls);
		 Iterator<Map.Entry<Integer, Character>> ent=map.entrySet().iterator();
		 while(ent.hasNext())
		 {
			 Map.Entry e=ent.next();
			 for(int i=0;i<s.length();i++)
			 {
				 if(e.getValue().equals(s.charAt(i)))
				 {
					 ls.add(i,e.getValue());
				 }
			 }
		 }
		 String str=null;
		 for(int i=0;i<ls.size();i++)
		 { 
			 if(str==null)
			 {
			 str=ls.get(i).toString();
			 }
			 else
			 {
				 str +=ls.get(i).toString();
			 }
		 }
		 System.out.println(str);
	}

}
