package hashMap;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class HackerRankQues {
	
	static void checkMagazine(String[] s, String[] str) {
        Map<String,Integer> m=new HashMap<String,Integer>();
        for(int i=0;i<str.length;i++) {
			if(m.containsKey(str[i])) {
				m.put(str[i],m.get(str[i])+1);
			} else {
				m.put(str[i],1);
			}
		}
		System.out.println(m);
		for(int i=0;i<s.length;i++) {
			if(m.containsKey(s[i])) {
				m.put(s[i], m.get(s[i])-1);
			}
		}
		System.out.println(m);
		for(int i=0;i<str.length;i++) {
			//System.out.println("***--"+str[i]);
			if(m.get(str[i])!=0)System.out.println("No-"+str[i]);
		}
		System.out.println("Yes");
    } 
    


	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> m=new HashMap<String, Integer>();
		String[] s= {"give","me","one","grand","today","night"};
				
		String[] str= {"give","one","grand","today"};
		
		/*
		 * for(int i=0;i<str.length;i++) { if(m.containsKey(str[i])) {
		 * m.put(str[i],m.get(str[i])+1); } else { m.put(str[i],1); } }
		 * System.out.println(m); for(int i=0;i<s.length;i++) { if(m.containsKey(s[i]))
		 * { m.put(s[i], m.get(s[i])-1); } } System.out.println(m); for(int
		 * i=0;i<str.length;i++) { //System.out.println("***--"+str[i]);
		 * if(m.get(str[i])!=0)System.out.println("--"+str[i]); }
		 */
		//System.out.println(m+"\n******************************");
		checkMagazine(s,str);
	}
   
}
