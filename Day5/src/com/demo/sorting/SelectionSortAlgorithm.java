package com.demo.sorting;

import java.util.Arrays;

public class SelectionSortAlgorithm {

	public static void selectionSortAscending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minpos=findNthMin(arr,i);
			//Swap minpos with i
			int temp=arr[i];
			arr[i]=arr[minpos];
			arr[minpos]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	private static int findNthMin(int[] arr, int start) {
		int minpos=start;
		int min=arr[minpos];
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minpos=i;
				
			}
		}
		return minpos;
	}

	public static void selectionSortDescending(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int maxpos=findNthMax(arr,i);
			//Swap maxpos with i
			int temp=arr[i];
			arr[i]=arr[maxpos];
			arr[maxpos]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static int findNthMax(int[] arr, int start) {
		int maxpos=start;
		int max=arr[maxpos];
		for(int i=start;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxpos=i;
				
			}
		}
		return maxpos;
	}
	

}
