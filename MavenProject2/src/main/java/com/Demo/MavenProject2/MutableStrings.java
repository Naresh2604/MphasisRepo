package com.Demo.MavenProject2;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer buff=new StringBuffer();
		buff.append("naresh");
		buff.append("sham");
		buff.append("kaushik");
		System.out.println(	buff.capacity());
		StringBuffer spf=new StringBuffer("naar");
	    System.out.println(spf);
		System.out.println(	spf.capacity());
		StringBuffer sbl=new StringBuffer("nareshh");
		
		sbl.replace(2,4,"suresh");
		System.out.println(sbl);
		String str="apple,banana";
		StringTokenizer tokenizer=new StringTokenizer(str,",");
		while(tokenizer.hasMoreTokens())
			 System.out.println(tokenizer.nextToken());
		StringJoiner sj=new StringJoiner(",");
		sj.add("naresh");
		sj.add("naresh");
		sj.add("naresh");
		System.out.println(sj);
	}

}
