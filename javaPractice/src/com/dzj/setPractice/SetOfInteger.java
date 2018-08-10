package com.dzj.setPractice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
public static void main(String[] args) {
	   Random random = new Random(47);
	   Set<Integer> intset = new HashSet<Integer>();
	   for(int i = 0 ; i<1000; i++)
		   intset.add(random.nextInt(30));
	   System.out.println(intset);
}
}
执行结果：
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
