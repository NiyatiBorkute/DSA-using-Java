package com.demo.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {

	public static void mergeSortAscending(int[] arr, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSortAscending(arr,start,mid);
			mergeSortAscending(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
		
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int n1=mid-start+1;
		int n2=end-mid;
		
		//Create left array
		int leftarray[]=new int[n1];
		int rigtharray[]=new int[n2];
		
		//copy contain of into left and rigth array
		for(int i=0;i<n1;i++) {
			leftarray[i]=arr[start+i];
		}
		for (int i=0;i<n2;i++) {
			rigtharray[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1 && j<n2) {
			if(leftarray[i]<rigtharray[j]) {
				arr[k]=leftarray[i];
				k++;
				i++;
			}else {
				arr[k]=rigtharray[j];
				j++;
				k++;
			}
		}
		while(i<n1) {
			arr[k]=leftarray[i];
			k++;
			i++;
		}
		while(j<n2) {
			arr[k]=rigtharray[j];
			k++;
			j++;
		}
		System.out.println(start+","+mid+","+end);
		System.out.println(Arrays.toString(leftarray));
		System.out.println(Arrays.toString(rigtharray));
		
		
	}

}
