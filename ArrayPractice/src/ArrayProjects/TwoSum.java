package ArrayProjects;

public class TwoSum {
	public static void main(String[] args) {
		int[]arr = new int[10];
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = 15;
		System.out.println(twoSumArry(arr, 7));
		
	}
	// Quesson 1 of leetcode 
	//Two Sum
	
	static int[] twoSumArry(int[]arr1, int target) {
		for(int i = 0; i< arr1.length; i++) {
			for(int j = i+1; j<arr1.length; j++) {
				if(arr1[i]+ arr1[j] == target) {
					return new int[] {i,j};
				}
			}
			
		}
		return arr1;
		
	}
	
	static void findMedianSortedArrays(int[]nums1,int m, int[] nums2, int n) {
		
			int p1 = m-1, p2 = n-1, i = m+n-1;	
			while(p2>=0) {
				if(p1>=0 && nums1[p1]> nums2[p2]) {
					nums1[i--] = nums1[p1--];
				}
				else {
					nums1[i--]= nums2[p2--];
				}
			}
	}
	

}
