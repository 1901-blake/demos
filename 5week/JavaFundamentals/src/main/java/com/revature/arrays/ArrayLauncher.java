package com.revature.arrays;

import java.util.Arrays;

public class ArrayLauncher {
	public static void main(String[] args) {
		int[] nums = new int[5];
		System.out.println(nums); // just gives some memory ref or something
		for(int num: nums) {
			System.out.println(num);
		}
			
		nums[2] = 16;
		System.out.println("after editing");
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(nums[100]); // unchecked exception
	}
}
