package com.Demo.MavenProject2;

import java.util.function.Function;

public class StaticMethodReference {
	static class NumberUtil{
		public static int squareNum(int num) {
			return num*num;
		}
	}
	public static void main(String[] args) {
		Function<Integer,Integer> squareFunction=(num) -> NumberUtil.squareNum(num);
		Function<Integer>
	}

}
